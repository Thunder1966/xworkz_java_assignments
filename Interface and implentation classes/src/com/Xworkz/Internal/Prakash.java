package com.Xworkz.Internal;

public interface Prakash {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules");
    }
}
