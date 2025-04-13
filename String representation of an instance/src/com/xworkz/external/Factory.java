package com.xworkz.external;

import com.xworkz.internal.Building;

public class Factory extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Factory(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }@Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 96385;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Factory){
                Factory factory=this;
                Factory factory1=(Factory) obj;
                if (factory1.name.equals(factory.name) && factory1.location.equals(factory.location) && factory1.noOfRooms==factory.noOfRooms){
                    return true;
                }
            }
        }
        return false;
    }
}
