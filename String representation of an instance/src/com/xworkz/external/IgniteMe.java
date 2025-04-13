package com.xworkz.external;

import com.xworkz.internal.Book;

public class IgniteMe extends Book {
    private String name;
    private String genre;
    private  int ratings;
    public IgniteMe(String name,String genre,int ratings){
        this.name=name;
        this.genre=genre;
        this.ratings=ratings;
    }

    @Override
    public String toString() {
        return "IgniteMe{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 8752;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof IgniteMe){
                IgniteMe igniteMe=this;
                IgniteMe igniteMe1=(IgniteMe) obj;
                if (igniteMe1.name.equals(igniteMe.name) ){
                    return true;
                }
            }
        }
        return false;
    }
}
