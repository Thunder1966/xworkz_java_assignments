package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Tape extends Tools {

    private int quantity;
    private String name;
    private String type;
    public Tape(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Tape{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 36984;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Tape){
                Tape tape=this;
                Tape tape1=(Tape) obj;
                if (tape1.name.equals(tape.name) && tape1.type.equals(tape.type) && tape1.quantity==tape.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
