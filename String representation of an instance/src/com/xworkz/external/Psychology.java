package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Psychology extends Subject {
    private int score;
    private String name;
    private String grade;
    public Psychology(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Psychology{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 741259;
    }
}
