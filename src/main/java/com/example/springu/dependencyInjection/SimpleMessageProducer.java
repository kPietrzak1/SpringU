package com.example.springu.dependencyInjection;

public abstract class SimpleMessageProducer implements MessageProducer {

    public String getMessage(){
        return "exampleMassage " + System.currentTimeMillis();
    }

    public abstract String getMassage();
}
