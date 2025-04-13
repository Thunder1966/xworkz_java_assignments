package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Tree extends Plant {
    private String name;
    private String type;
    private String location;
    public Tree(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 14759;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Tree){
                Tree tree=this;
                Tree tree1=(Tree) obj;
                if (tree1.location.equals(tree.location) && tree1.type.equals(tree.type) && tree1.name.equals(tree.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
