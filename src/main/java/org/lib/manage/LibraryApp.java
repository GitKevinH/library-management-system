package org.lib.manage;

public class LibraryApp {
    public static void main(String[] args) {

        //initializing library
        LibraryManager<LibraryItem> library = new LibraryManager<>();

        //Creating the objects to be inserted into the list
        Book bookOne = new Book("1984",1949,"George Orwell", "9780451524935");
        Book bookTwo = new Book("To Kill a Mockingbird",1960, "Harper Lee", "9780446310789");

        DVD dvdOne = new DVD("The Martian", 2015, "Ridley Scott", 151);
        DVD dvdTwo = new DVD("I Am Legend", 2007,"Francis Lawrence", 101);

        //adding books & DVDs as items to the library

        library.addItem(bookOne);
        library.addItem(dvdOne);
        library.addItem(bookTwo);
        library.addItem(dvdTwo);

        // printing to show items were added (and to show function to display library works)
        System.out.println("------Printing Library after adding objects--------------");
        library.displayItems();


        // removing first book and first dvd from library
        library.removeItem(bookOne);
        library.removeItem(dvdOne);

        // printing to show items were deleted
        System.out.println("------Printing Library after deleting objects--------------");
        library.displayItems();
        System.out.println("-------------------");




       }

}
