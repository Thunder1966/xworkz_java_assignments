package com.xworkz.external;

import com.xworkz.internal.Building;

public class Library extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Library(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 12546;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Library){
                Library library=this;
                Library library1=(Library) obj;
                if (library1.name.equals(library.name) && library1.location.equals(library.location) && library.noOfRooms==library1.noOfRooms){
                    return true;
                }
            }
        }
        return false;
    }
}
