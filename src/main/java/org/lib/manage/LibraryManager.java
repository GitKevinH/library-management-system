package org.lib.manage;

import java.util.ArrayList;

public class LibraryManager<T extends LibraryItem > implements LibraryOperations<T>{
    public ArrayList<T> list = new ArrayList<>();

    public LibraryManager() {
        this.list = list;
    }


    @Override
    public void addItem(T item) {
        list.add(item);

    }

    @Override
    public void removeItem(T item) {
        list.remove(item);
    }

    @Override
    public void displayItems() {

        for (T item : list) {
            System.out.println(item.getItemDetails());
        }

    }
}
