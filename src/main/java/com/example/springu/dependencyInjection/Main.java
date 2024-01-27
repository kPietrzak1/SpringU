package com.example.springu.dependencyInjection;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        MessageProducer messageProducer = new ConsoleMassageProducer();
        MessagePrinter messagePrinter = new MessagePrinter(messageProducer);
        messagePrinter.printMessage();

        Librarian librarian = new Librarian("Daniekl");
        Library library = new Library(librarian);

        library.addBook(new Book("bad Boy", "Dandi"));
        library.printBook();


    }
}
