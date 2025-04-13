package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class DebitCard extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public DebitCard(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 963;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof DebitCard){
                DebitCard debitCard=this;
                DebitCard debitCard1=(DebitCard) obj;
                if (debitCard1.name.equals(debitCard.name) && debitCard1.cardNo==debitCard.cardNo && debitCard.date==debitCard1.date){
                    return true;
                }

            }
        }
        return false;
    }
}
