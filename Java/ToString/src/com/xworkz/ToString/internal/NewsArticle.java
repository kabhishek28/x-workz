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

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof NewsArticle) {
                NewsArticle other = (NewsArticle) object;
                if (this.headline.equals(other.headline) &&
                        this.author.equals(other.author) &&
                        this.category.equals(other.category)){

                    return true;
                }
            }
        }
        return false;
    }
}


