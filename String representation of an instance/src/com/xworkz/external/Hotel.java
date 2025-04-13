package com.xworkz.external;

import com.xworkz.internal.Building;

public class Hotel extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Hotel(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 21654;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Hotel){
                Hotel hotel=this;
                Hotel hotel1=(Hotel) obj;
                if (hotel1.name.equals(hotel.name) && hotel1.location.equals(hotel.location) && hotel1.noOfRooms==hotel.noOfRooms){
                    return true;
                }
            }
        }
        return false;
    }
}
