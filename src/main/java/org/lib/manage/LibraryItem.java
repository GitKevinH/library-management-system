package org.lib.manage;

abstract public class LibraryItem {

    String title;
    int releaseYear;

    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    //getters & setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    //methods
    public abstract String getItemType();
    public abstract String getItemDetails();

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
