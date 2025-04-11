package com.xworkz.ToString.internal;

public class ArtGallery {

        private String galleryName;
        private String artist;
        private int totalPaintings;

        public ArtGallery(String galleryName, String artist, int totalPaintings) {
            this.galleryName = galleryName;
            this.artist = artist;
            this.totalPaintings = totalPaintings;
        }

        @Override
        public String toString() {
            return "Gallery: " + galleryName + ", Featured Artist: " + artist + ", Paintings: " + totalPaintings;
        }
    @Override
    public int hashCode(){
        return 4;
    }

}
