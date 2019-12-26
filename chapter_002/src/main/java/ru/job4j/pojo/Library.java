package ru.job4j.pojo;

public class Library {
    public  static void main(String[] args) {
        Book book1 = new Book("First Book", 100);
        Book book2 = new Book("Second Book", 200);
        Book book3 = new  Book("Third book", 300);
        Book book0 = new Book("Clean Code", 400);
        Book[] books = new Book[4];
        books[0] = book0;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        System.out.println("-------------------------");

        Book tempBook = new Book(books[3].getName(), books[3].getPages());
        books[3].setName(books[0].getName());
        books[3].setPages(books[0].getPages());
        books[0].setPages(tempBook.getPages());
        books[0].setName(tempBook.getName());

        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }


    }
}
