package com.xworkz.external;

import com.xworkz.internal.Student;

public class Anisha extends Student {
    private String name;
    private int age ;
    private char grade;
    public Anisha(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 1872;
    }
    @Override
    public String toString() {
        return "Anish{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
