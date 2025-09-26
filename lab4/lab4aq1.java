import java.util.Scanner;

public class lab4aq1 {

    public static void main(String[] args) {
        try ( // MyHr System
                Scanner input = new Scanner(System.in)) {
            Office[] rooms = new Office[3]; //three office records automatically
            for(int i = 0; i < 3; i++){
                rooms[i] = new Office();
            }
            
            Employee[] peps = new Employee[5]; //maximum number of 5 employees records
            // int count = 0; number of employees
            
            
            while(true)
            {
                System.out.println("---------Welcome to our HR System------------");
                System.out.println("1. List all offices");
                System.out.println("2. Create a new employee record");
                System.out.println("3. List all the employees");
                System.out.println("4. Quit now"); 
                
                
                System.out.print("Enter your option below: ");
                int option = input.nextInt();
                
                if(option == 1)
                {
                    //List all offices
                    for (Office room : rooms) {
                        System.out.println("Room Number " + room.getRoomNo());
                    }
                }
                
                else if (option == 2) 
                {
                    System.out.println("How many employee records do you want to create(max 5): ");
                    int noEmp = input.nextInt();
                    
                    //Notice: max is 5
                    if (noEmp >= 5) 
                    {
                        System.out.println("You can only create up to 5 employees."); 
                        noEmp = 5;
                    }
                    
                    //Creating employee records
                    for (int i = 0; i < noEmp && Employee.getNoOfEmps() < 5; i++)
                    {
                        System.out.println("Enter the employee's city: ");
                        String city = input.next();
                        System.out.println("Enter the employee's town: ");
                        String town = input.next();
                        System.out.println("Enter the employee's county");
                        String county = input.next();
                        System.out.println("Enter the employee's job position (either staff or manager): ");
                        String job = input.next();
                        int index = Employee.getNoOfEmps();
                        peps[index] = new Employee(city, town, county, job);
                        System.out.println("Employee " + peps[index].getLatestId() + " created.");
                        
                        System.out.println("Enter which room number to place employee (100 101, 102)");
                        int room = input.nextInt();
                        // enter the office number to check if it is assigned with maximum of two employees
                        
                        boolean assigned = false;
                        for (Office office : rooms)
                        {
                            if (office.getRoomNo() == room) 
                            {
                                assigned = office.addEmployee(peps[Employee.getNoOfEmps() - 1]); // last created employee
                                if (assigned)
                                {
                                    office.listEmployeeRecords(); //  prints all employees in this office
                                }
                                System.out.println("No of employees assigned to this office: " + office.getNoOfEmployees());
                                break;
                            }
                        }
                        
                        if (!assigned)
                        {
                            System.out.println("Employee could not be assigned to office.");
                        }
                        
                        // increase the global employee counter only if successfully created
                    }
                }
                else if(option == 3) 
                {
                    for (int i = 0; i < Employee.getNoOfEmps(); i++)
                    {
                        System.out.println(peps[i].toString());
                    }
                }
                else if(option == 4){
                    System.out.println("Exiting MyHr GoodBye....");
                    break;
                }
                else{
                    System.out.println("Invalid Option!!");
                }
                
            }  } //three office records automatically
        System.out.println("Number of employee's records: " + Employee.getNoOfEmps());
        System.out.println("Total number of employees assigned across all offices: " + Office.totalAssigned());
    }
}