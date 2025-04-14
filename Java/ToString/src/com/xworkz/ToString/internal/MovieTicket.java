package com.xworkz.ToString.internal;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie: " + movieName + ", Seat: " + seatNumber + ", Price: ₹" + price;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof MovieTicket) {
                MovieTicket other = (MovieTicket) object;
                if (this.movieName.equals(other.movieName) &&
                        this.seatNumber.equals(other.seatNumber) &&
                        this.price == other.price) {
                    return true;
                }
            }
        }
        return false;
    }
}
