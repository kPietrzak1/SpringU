package com.example.springu.dependencyInjection;

public class ClassD {

    private ClassA a = new ClassA();
    private ClassC c = new ClassC(a);

    public ClassD(ClassA a, ClassC c) {
    }
}
