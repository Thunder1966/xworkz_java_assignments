package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class Bitcoin extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public Bitcoin(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Bitcoin{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 448;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Bitcoin){
                Bitcoin bitcoin=this;
                Bitcoin bitcoin1=(Bitcoin) obj;
                if (bitcoin1.name.equals(bitcoin.name) && bitcoin1.cardNo==bitcoin.cardNo && bitcoin1.date==bitcoin.date){
                    return true;
                }

            }
        }
        return false;
    }
}
