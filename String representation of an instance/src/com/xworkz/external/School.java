package com.xworkz.external;

import com.xworkz.internal.Building;

public class School extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public School(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 24585;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof School){
                School school=this;
                School school1=(School) obj;
                if (school1.name.equals(school.name) && school1.location.equals(school.location) && school1.noOfRooms==school.noOfRooms){
                    return true;
                }
            }
        }
        return false;
    }
}
