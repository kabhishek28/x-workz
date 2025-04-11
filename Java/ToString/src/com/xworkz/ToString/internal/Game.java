package com.xworkz.ToString.internal;

public class Game {

        private String gameName;
        private String genre;
        private double rating;

        public Game(String gameName, String genre, double rating) {
            this.gameName = gameName;
            this.genre = genre;
            this.rating = rating;
        }

        @Override
        public String toString() {
            return "Game: " + gameName + ", Genre: " + genre + ", Rating: " + rating + "/5";
        }

    @Override
    public int hashCode(){
        return 4;
    }
}
