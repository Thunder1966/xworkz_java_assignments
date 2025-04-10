package com.xworkz.external;

import com.xworkz.internal.Book;

public class Notes extends Book {
    private String name;
    private int page;
    private String story;
    public Notes(String name, int page, String story)
    {
        this.name=name;
        this.page=page;
        this.story=story;
    }

    @Override
    public String toString() {
        return "notes{" +
                "name='" + name + '\'' +
                ", page=" + page +
                ", story='" + story + '\'' +
                '}';
    }
}
