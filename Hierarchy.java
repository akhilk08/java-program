import java.util.Scanner; 

class Publisher { 
    String publisherName; 

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Literature extends Publisher {
    String agencyName;
    String bookName;
    String author;
    int price;
    String type;

    Literature(String publisherName, String agencyName, String bookName, String author, int price, String type) {
        super(publisherName);
        this.agencyName = agencyName;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    void display() {
        System.out.println("Publisher Name: " + this.publisherName);
        System.out.println("Agency Name: " + this.agencyName);
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("Type: " + this.type);
    }
}

class Fiction extends Publisher {
    String agencyName;
    String bookName;
    String author;
    int price;
    String type;

    Fiction(String publisherName, String agencyName, String bookName, String author, int price, String type) {
        super(publisherName);
        this.agencyName = agencyName;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    void display() {
        System.out.println("Publisher Name: " + this.publisherName);
        System.out.println("Agency Name: " + this.agencyName);
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("Type: " + this.type);
    }
}

public class Category { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Scanner s = new Scanner(System.in); 

        System.out.println("Enter the details of the literature book:"); 
        System.out.print("Publisher Name: "); 
        String publisherName1 = s.nextLine(); 
        System.out.print("Agency Name: "); 
        String agencyName1 = s.nextLine(); 
        System.out.print("Book Name: "); 
        String bookName1 = s.nextLine(); 
        System.out.print("Author: "); 
        String author1 = s.nextLine();         
        System.out.print("Price: ");         
        int price1 = sc.nextInt(); 
        sc.nextLine(); // Consume the newline 
        System.out.print("Type: "); 
        String type1 = s.nextLine(); 

        Literature literatureBook = new Literature(publisherName1, agencyName1, bookName1, author1, price1, type1); 

        System.out.print("Agency Name: ");
        String agencyName2 = s.nextLine();
        System.out.print("Book Name: ");
        String bookName2 = s.nextLine(); 
        System.out.print("Author: "); 
        String author2 = s.nextLine(); 
        System.out.print("Price: "); 
        int price2 = sc.nextInt(); 
        sc.nextLine(); // Consume the newline 
        System.out.print("Type: "); 
        String type2 = s.nextLine(); 
        
        Fiction fictionBook = new Fiction(publisherName1, agencyName2, bookName2, author2, price2, type2); 
        System.out.println("\nDetails of the literature book:"); 
        literatureBook.display(); 
        System.out.println("\nDetails of the fiction book:"); 
        fictionBook.display(); 
    } 
}
