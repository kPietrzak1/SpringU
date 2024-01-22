package com.example.springu.dependencyInjection;

public class SimpleMessageProducer {

    String getMessage(){
        return "exampleMassage " + System.currentTimeMillis();
    }
}
