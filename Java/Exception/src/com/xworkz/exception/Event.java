package com.xworkz.exception;

import javax.sound.sampled.LineUnavailableException;
import java.lang.invoke.LambdaConversionException;
import java.util.concurrent.ExecutionException;

public class Event {
    public void unChecked() throws LineUnavailableException {
        if(true){
            System.out.println("Run");
            throw new LineUnavailableException();
        }

    }

    public void checked(){

    }
}

