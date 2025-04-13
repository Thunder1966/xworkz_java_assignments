package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Biology extends Subject {
    private int score;
    private String name;
    private String grade;
    public Biology(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Biology{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 3536;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Biology){
                Biology biology=this;
                Biology biology1=(Biology) obj;
                if (biology.name.equals(biology.name) && biology1.grade.equals(biology.grade) && biology1.score==biology.score){
                    return true;
                }

            }
        }
        return false;
    }
}
