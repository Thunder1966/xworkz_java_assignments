package com.xworkz.external;

import com.xworkz.internal.Subject;

public class History extends Subject {
    private int score;
    private String name;
    private String grade;
    public History(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "History{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 74185;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof History){
                History history=this;
                History history1=(History) obj;
                if (history1.name.equals(history.name) && history1.grade.equals(history.grade) && history1.score==history.score){
                    return true;
                }

            }
        }
        return false;
    }
}
