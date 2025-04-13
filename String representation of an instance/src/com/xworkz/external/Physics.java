package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Physics extends Subject {
    private int score;
    private String name;
    private String grade;
    public Physics(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Physics{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 12549;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Physics){
                Physics physics=this;
                Physics physics1=(Physics) obj;
                if (physics1.name.equals(physics.name) && physics1.grade.equals(physics.grade) && physics1.score==physics.score){
                    return true;
                }
            }
        }
        return false;
    }
}

