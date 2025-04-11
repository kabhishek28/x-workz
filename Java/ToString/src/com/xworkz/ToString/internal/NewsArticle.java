package com.xworkz.ToString.internal;

public class NewsArticle {
    private String headline;
    private String author;
    private String category;

    public NewsArticle(String headline, String author, String category) {
        this.headline = headline;
        this.author = author;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Headline: " + headline + ", Author: " + author + ", Category: " + category;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
