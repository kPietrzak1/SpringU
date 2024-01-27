package com.example.springu.containerDependencyInjection;

public class ClassB {
    private ClassA a = new ClassA();

    public ClassB(ClassA a) {
    }
}

