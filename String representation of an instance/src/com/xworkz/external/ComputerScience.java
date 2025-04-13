package com.xworkz.external;

import com.xworkz.internal.Subject;

public class ComputerScience extends Subject {
    private int score;
    private String name;
    private String grade;
    public ComputerScience(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "ComputerScience{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 974613;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof ComputerScience){
                ComputerScience computerScience=this;
                ComputerScience computerScience1=(ComputerScience) obj;
                if (computerScience1.name.equals(computerScience.name) && computerScience1.grade.equals(computerScience.grade) && computerScience1.score==computerScience.score){
                    return true;
                }

            }
        }
        return false;
    }
}
