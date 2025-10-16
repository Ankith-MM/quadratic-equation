import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private double price;
    private int numPages;

   
    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

   
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getNumPages() {
        return numPages;
    }

    
    @Override
    public String toString() {
        return "Book Name: " + name +
               "\nAuthor: " + author +
               "\nPrice: ₹" + price +
               "\nNumber of Pages: " + numPages;
    }
}

public class aut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Book[] books = new Book[n]; 

       
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1) + ":");

            System.out.print("Enter book name: ");
            String name = sc.nextLine();

            System.out.print("Enter author name: ");
            String author = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter number of pages: ");
            int pages = sc.nextInt();
            sc.nextLine(); 

            books[i] = new Book(name, author, price, pages);
        }

       
        System.out.println("\n----- Book Details -----");
        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + " Details:");
            System.out.println(books[i].toString());
        }

        sc.close();
    }
}
