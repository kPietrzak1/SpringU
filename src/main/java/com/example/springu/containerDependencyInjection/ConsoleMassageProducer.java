package com.example.springu.containerDependencyInjection;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ConsoleMassageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        Scanner scanner = new Scanner(in);
        out.println("Enter text to print");
        return scanner.nextLine();
    }
}
