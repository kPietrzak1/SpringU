package com.example.springu.dependencyInjection;

public class Librarian {

    private final String name;

    public Librarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
