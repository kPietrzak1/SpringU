package com.example.springu.containerDependencyInjection;

public abstract class SimpleMessageProducer implements MessageProducer {

    public String getMessage(){
        return "exampleMassage " + System.currentTimeMillis();
    }

    public abstract String getMassage();
}
