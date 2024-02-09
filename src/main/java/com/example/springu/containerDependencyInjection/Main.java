package com.example.springu.containerDependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Main.class);
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        messagePrinter.printMessage();

        Arrays.stream(context.getBeanDefinitionNames())
                .map(context::getBean)
                .forEach(System.out::println);

        MessageProducer messageProducer = new ConsoleMassageProducer();

        Librarian librarian = new Librarian("Daniekl");
        Library library = new Library(librarian);

        library.addBook(new Book("bad Boy", "Dandi"));
        library.printBook();


    }
}
