package org.lib.manage;

public class Book extends LibraryItem {
    String author;
    String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;

    }


    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + this.title + "\n" +
                "Author: " + this.author +"\n" +
                "Release Year: " + this.releaseYear + "\n" +
                "ISBN: " + this.ISBN + "\n"+
                "Item Type: " + getItemType() + "\n";


    }
}
