package com.example.springu.dependencyInjection;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SimpleMessageProducer simpleMessageProducer = new SimpleMessageProducer();
        MessagePrinter messagePrinter = new MessagePrinter(simpleMessageProducer);
        messagePrinter.printMessage();

        Librarian librarian = new Librarian("Daniekl");
        Library library = new Library(librarian);

        library.addBook(new Book("bad Boy", "Dandi"));
        library.printBook();
    }
}
