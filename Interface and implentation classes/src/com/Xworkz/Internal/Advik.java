package com.Xworkz.Internal;

public interface Advik {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of Advik");
    }

}
