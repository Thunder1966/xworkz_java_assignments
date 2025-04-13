package com.xworkz.external;

import com.xworkz.internal.Book;

public class TwistedLie extends Book {
    private String name;
    private String genre;
    private  int ratings;
    public TwistedLie(String name,String genre,int ratings){
        this.name=name;
        this.genre=genre;
        this.ratings=ratings;
    }

    @Override
    public String toString() {
        return "TwistedLie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 3259;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof TwistedLie){
                TwistedLie twistedLie=this;
                TwistedLie twistedLie1=(TwistedLie) obj;
                if (twistedLie1.name.equals(twistedLie.name) ){
                    return true;
                }
            }
        }
        return false;
    }
}
