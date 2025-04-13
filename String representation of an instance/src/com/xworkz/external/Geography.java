package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Geography extends Subject {
    private int score;
    private String name;
    private String grade;
    public Geography(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Geography{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 41852;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Geography){
                Geography geography=this;
                Geography geography1=(Geography) obj;
                if (geography1.name.equals(geography.name) && geography1.grade.equals(geography.grade) && geography1.score==geography.score){
                    return true;
                }

            }
        }
        return false;
    }
}
