package com.xworkz.external;

import com.xworkz.internal.Tools;

import javax.tools.Tool;

public class ScrewDriver extends Tools {
    private int quantity;
    private String name;
    private String type;
    public ScrewDriver(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "ScrewDriver{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 47585;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof ScrewDriver){
                ScrewDriver screwDriver=this;
                ScrewDriver screwDriver1=(ScrewDriver) obj;
                if (screwDriver1.name.equals(screwDriver.name) && screwDriver1.type.equals(screwDriver.type) && screwDriver1.quantity==screwDriver.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
