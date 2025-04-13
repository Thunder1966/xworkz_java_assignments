package com.xworkz.external;

import com.xworkz.internal.Book;

public class ShatterMe extends Book {
    private String name;
    private String genre;
    private  int ratings;
    public ShatterMe(String name,String genre,int ratings){
        this.name=name;
        this.genre=genre;
        this.ratings=ratings;
    }

    @Override
    public String toString() {
        return "ShatterMe{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 145932;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof ShatterMe){
                ShatterMe shatterMe=this;
                ShatterMe shatterMe1=(ShatterMe) obj;
                if (shatterMe1.name.equals(shatterMe.name) ){
                    return true;
                }
            }
        }
        return false;
    }
}
