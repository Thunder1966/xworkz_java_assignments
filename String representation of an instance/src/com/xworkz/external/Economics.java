package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Economics extends Subject {
    private int score;
    private String name;
    private String grade;
    public Economics(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Economics{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 74163;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Economics){
                Economics economics=this;
                Economics economics1=(Economics) obj;
                if (economics1.name.equals(economics.name) && economics1.grade.equals(economics.grade) && economics1.score==economics.score){
                    return true;
                }

            }
        }
        return false;
    }
}
