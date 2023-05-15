package org.lib.manage;

public class DVD extends LibraryItem {
    String director;
    int duration;

    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + this.title + "\n" +
                "Director: " + this.director +"\n" +
                "Release Year: " + this.releaseYear + "\n" +
                "Duration: " + this.duration + "\n"+
                "Item Type: " + getItemType() + "\n";
    }
}
