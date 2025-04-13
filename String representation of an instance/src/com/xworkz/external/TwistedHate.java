package com.xworkz.external;

import com.xworkz.internal.Book;

public class TwistedHate extends Book {
    private String name;
    private String genre;
    private  int ratings;
    public TwistedHate(String name,String genre,int ratings){
        this.name=name;
        this.genre=genre;
        this.ratings=ratings;
    }

    @Override
    public String toString() {
        return "TwistedHate{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 14258;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof TwistedHate){
                TwistedHate twistedHate=this;
                TwistedHate twistedHate1=(TwistedHate) obj;
                if (twistedHate1.name.equals(twistedHate.name) ){
                    return true;
                }
            }
        }
        return false;
    }
}
