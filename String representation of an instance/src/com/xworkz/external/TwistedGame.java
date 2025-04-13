package com.xworkz.external;

import com.xworkz.internal.Book;

public class TwistedGame extends Book {
    private String name;
    private String genre;
    private  int ratings;
    public TwistedGame(String name,String genre,int ratings){
        this.name=name;
        this.genre=genre;
        this.ratings=ratings;
    }

    @Override
    public String toString() {
        return "TwistedGame{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 45896;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof TwistedGame){
                TwistedGame twistedGame=this;
                TwistedGame twistedGame1=(TwistedGame) obj;
                if (twistedGame1.name.equals(twistedGame.name) ){
                    return true;
                }
            }
        }
        return false;
    }
}
