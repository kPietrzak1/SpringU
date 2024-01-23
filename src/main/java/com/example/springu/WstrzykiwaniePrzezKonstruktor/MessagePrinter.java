package com.example.springu.WstrzykiwaniePrzezKonstruktor;

public class MessagePrinter {
//    private final SimpleMessageProducer messageProducer = new SimpleMessageProducer();
    // usuwamy bo bedziemy wstrzykiwac zaleznosci przez konstruktor


    private final SimpleMessageProducer messageProducer;

    public MessagePrinter(SimpleMessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
