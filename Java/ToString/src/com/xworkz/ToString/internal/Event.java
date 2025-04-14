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

    @Override
    public int hashCode(){
        return 4;
    }
    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Event) {
                Event other = (Event) object;
                if (this.date.equals(other.date) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
