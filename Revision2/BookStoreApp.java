import java.util.*;

public class BookStoreApp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice;
        List<Branch> branches = new ArrayList<>(); // create a list to hold Branch objects (populate as needed) automatically
        branches.add(new Branch("Dublin Branch", new Location("12 Main St", "Dublin", "Dublin")));
        branches.add(new Branch("Cork Branch", new Location("4 Grand Parade", "Cork", "Cork")));
        branches.add(new Branch("Galway Branch", new Location("2 Market Rd", "Galway", "Galway")));
        branches.add(new Branch("Limerick Branch", new Location("7 High St", "Limerick", "Limerick")));

        ArrayList<Book> allBooks = new ArrayList<>();

        do{
            System.out.println("===Book Store System===");
            System.out.println("1. List all branches");
            System.out.println("2. Add new book");
            System.out.println("3. List all books");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch(choice){
                // List all the branches
                case 1:
                    if (branches.isEmpty()) {
                        System.out.println("No branches available.");
                    } else {
                        for(Branch b : branches){
                            System.out.println(b.toString());
                        }
                    }
                    break;
                case 2:
                // Adding a new book to a selected branch
                System.out.println("Time to add a new book..");
                    if(Book.returnBookTotal() >= 15){
                        System.out.println("Max of 15 books in the system");
                        break;
                    }

                    System.out.println("Enter book title: ");
                    String title = input.next();
                    System.out.println("Enter book genre: ");
                    String genre = input.next();
                    System.out.println("Enter the book price");
                    double price = input.nextDouble();

                    System.out.println("Enter author first name: ");
                    String firstN = input.next();
                    System.out.println("Enter the author last name:");
                    String lastN = input.next();
                    System.out.println("Enter nationality: ");
                    String nation = input.next();

                    Book newBook = new Book(title, genre, price, new Author(firstN, lastN, nation));

                    // List all the branches available
                    System.out.println("Select branch to assign: ");
                    for(int i = 0; i < branches.size(); i++){
                        System.out.println(i + 1 + " " + branches.get(i));
                    }

                    System.out.println("Enter Choice: ");
                    int branchChoice = input.nextInt() - 1;

                    // Use the temp selected to add book to Branch class and add to available books
                    if(branchChoice >= 0 && branchChoice < branches.size()){
                        Branch selected = branches.get(branchChoice);
                        if(selected.addBook(newBook)){
                            allBooks.add(newBook);
                            System.out.println("Book added successfully to: " + selected);
                        }
                    }

                    break;
                case 3:
                // List all the books available
                // if(allBooks.isEmpty()){
                //     System.out.println("No book has been added to the system!!");
                // }
                // else{
                //         for(Book b : allBooks){
                //             System.out.println(b.toString());
                //         }
                //     }
                boolean ifAnyBooks = false;
                for(Branch b : branches){
                    if(b.getBookCount() > 0){
                        System.out.println("Books in " + b);
                        b.listBooks();
                        ifAnyBooks = true;
                    }
                }

                if(ifAnyBooks == false){
                    System.out.println("No books have been added to any branch yet.");
                }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 4);
        input.close();
    }
}
