package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Maths extends Subject {
    private int score;
    private String name;
    private String grade;
    public Maths(String name, String grade, int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Maths{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 54815;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Maths){
                Maths maths=this;
                Maths maths1=(Maths) obj;
                if (maths1.name.equals(maths.name) && maths1.grade.equals(maths.grade) && maths1.score==maths.score){
                    return true;
                }

            }
        }
        return false;
    }
}
