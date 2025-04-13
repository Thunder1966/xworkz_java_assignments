package com.xworkz.external;

import com.xworkz.internal.Dog;

public class GoldenRetriver extends Dog {
    private String name;
    private int age;
    private int  hight;
    public GoldenRetriver(String name,int age, int hight){
        this.name=name;
        this.age=age;
        this.hight=hight;
    }

    @Override
    public String toString() {
        return "GoldenRetriver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hight=" + hight +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 21552;
    }
}
