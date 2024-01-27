package com.example.springu.containerDependencyInjection;

public class Librarian {

    private final String name;

    public Librarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
