package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Chemistry extends Subject {
    private int score;
    private String name;
    private String grade;
    public Chemistry(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Chemistry{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 8574;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Chemistry){
                Chemistry chemistry=this;
                Chemistry chemistry1=(Chemistry) obj;
                if (chemistry1.name.equals(chemistry.name) && chemistry1.grade.equals(chemistry.grade) && chemistry1.score==chemistry.score){
                    return true;
                }

            }
        }
        return false;
    }
}
