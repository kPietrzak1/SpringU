package com.example.springu.WstrzykiwaniePrzezKonstruktor;

public class Main {
    public static void main(String[] args) {

        SimpleMessageProducer messageProducer = new SimpleMessageProducer();
        MessagePrinter messagePrinter = new MessagePrinter(messageProducer);
        messagePrinter.printMessage();

    }
}
