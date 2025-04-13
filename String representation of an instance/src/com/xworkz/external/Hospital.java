package com.xworkz.external;

import com.xworkz.internal.Building;

public class Hospital extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Hospital(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 12256;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Hospital){
                Hospital hospital=this;
                Hospital hospital1=(Hospital) obj;
                if (hospital1.name.equals(hospital.name) && hospital1.location.equals(hospital.location) && hospital1.noOfRooms==hospital.noOfRooms){
                    return true;
                }
            }
        }
        return false;
    }
}
