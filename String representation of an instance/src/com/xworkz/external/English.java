package com.xworkz.external;

import com.xworkz.internal.Subject;

public class English extends Subject {
    private int score;
    private String name;
    private String grade;
    public English(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "English{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 85274;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof English){
                English english=this;
                English english1=(English) obj;
                if (english1.name.equals(english.name) && english1.grade.equals(english.grade) && english1.score==english.score){
                    return true;
                }

            }
        }
        return false;
    }
}
