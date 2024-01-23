package com.company.design.strategy;

public class Encorder {

    private  EncordingStrategy encordingStrategy;

    public String getMessage(String message){
        return this.encordingStrategy.encode(message);
    }

    public void setEncordingStrategy(EncordingStrategy encordingStrategy) {
        this.encordingStrategy = encordingStrategy;
    }
}
