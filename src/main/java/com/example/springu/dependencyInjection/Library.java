package com.example.springu.dependencyInjection;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private Librarian librarian;
    private List<Book> books;

    public Library(Librarian librarian) {
        this.librarian = librarian;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void printBook(){
        for (Book book : books){
            System.out.println(book);
        }
    }
}
