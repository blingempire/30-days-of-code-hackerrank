import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

class MyBook extends Book {
    int my_price;
    MyBook(String title, String author, int price) {
        super(title, author);
        my_price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: %d", my_price);
    }
}

// Write your constructor here

/**
 *   Method Name: display
 *
 *   Print the title, author, and price in the specified format.
 **/
// Write your method here

// End class


public class Day13AbstractClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
