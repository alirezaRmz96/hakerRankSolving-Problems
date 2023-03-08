package thityDaysCode;

import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class Abstract extends Book {
    String title;
    String author;
    int price;

    Abstract(String title, String author, int price) {
        super(title, author);
        this.author = author;
        this.title = title;
        this.price = price;
    }

    @Override
    void display() {
        System.out.println(
                "Title: " + title +
                        "\nAuthor: " + author +
                        "\nPrice: " + price
        );
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new Abstract(title, author, price);
        book.display();
    }
}