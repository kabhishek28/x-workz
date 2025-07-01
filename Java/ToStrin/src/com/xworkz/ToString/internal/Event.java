package com.xworkz.ToString.internal;

public class Event {

        private String eventName;
        private String location;
        private String date;

        public Event(String eventName, String location, String date) {
            this.eventName = eventName;
            this.location = location;
            this.date = date;
        }

        @Override
        public String toString() {
            return "Event: " + eventName + ", Location: " + location + ", Date: " + date;
        }


}
