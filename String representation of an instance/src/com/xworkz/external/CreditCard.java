package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class CreditCard extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public CreditCard(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 8745;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof CreditCard){
                CreditCard creditCard=this;
                CreditCard creditCard1=(CreditCard) obj;
                if (creditCard1.name.equals(creditCard.name) && creditCard1.cardNo==creditCard.cardNo && creditCard1.date==creditCard.date){
                    return true;
                }

            }
        }
        return false;
    }
}
