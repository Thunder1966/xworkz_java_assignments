package com.xworkz.external;

import com.xworkz.internal.Tools;

public class PaintBrush extends Tools {
    private int quantity;
    private String name;
    private String type;
    public PaintBrush(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "PaintBrush{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 124586;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof PaintBrush){
                PaintBrush paintBrush=this;
                PaintBrush paintBrush1=(PaintBrush) obj;
                if (paintBrush1.name.equals(paintBrush.name) && paintBrush1.type.equals(paintBrush.type) && paintBrush1.quantity==paintBrush.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
