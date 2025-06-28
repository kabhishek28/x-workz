package com.xworkz.exception;

import javax.sound.sampled.LineUnavailableException;

public class EventRunner {
    public static void main(String[] args) throws LineUnavailableException {
        Event event = new Event();
        event.unChecked();
    }
}
