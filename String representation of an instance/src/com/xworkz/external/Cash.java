package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class Cash extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public Cash(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Cash{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 785;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Cash){
                Cash cash=this;
                Cash cash1=(Cash) obj;
                if (cash1.name.equals(cash.name) && cash1.cardNo==cash.cardNo && cash1.date==cash.date){
                    return true;
                }

            }
        }
        return false;
    }
}
