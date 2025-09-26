public class Office {
    
    // Offices have a room number and are filled with employees
    private static int latestNo = 100; //room number starting at 100 using static
    private int currentNo;
    private int noOfOffices;
    private Employee[] occupants = new Employee[2]; // max two employees per office room
    private int count = 0;
    private static int assignedCount = 0;

    public Office(){
        this.currentNo = latestNo;
        latestNo++;
    }

    public int getRoomNo(){
        return currentNo;
    }

    public void setNoOfOffices(int numsOffice){
        noOfOffices =  numsOffice;
    }

    public int getNoOfOffices(){
        return noOfOffices;
    }

    //Setting the maximum of two people in an office
    public boolean addEmployee(Employee e) {
        if (count < 2) {
            occupants[count] = e;
            e.setOffice(this); // link employee to this office
            count++;
            assignedCount++;
            return true;
        } else {
            System.out.println("Office " + currentNo + " is full.");
            return false;
        }
    }

    public int getNoOfEmployees() {
        //In a singular office
        return count;
    }


    public static int totalAssigned(){
        //Total number of employees assigned to offices
        return assignedCount;
    }

    

    //  Method to show all records
    public void listEmployeeRecords() {
        for (int i = 0; i < count; i++) {
            System.out.println(occupants[i]);
        }
    }

    @Override
    public String toString(){
        return "Room Number: " + latestNo;
    }

}