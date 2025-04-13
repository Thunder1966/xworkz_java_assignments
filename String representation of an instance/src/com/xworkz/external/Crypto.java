package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class Crypto extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public Crypto(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Crypto{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 741;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Crypto){
                Crypto crypto=this;
                Crypto crypto1=(Crypto) obj;
                if (crypto.name.equals(crypto1.name) && crypto1.cardNo==crypto.cardNo && crypto1.date==crypto.date){
                    return true;
                }

            }
        }
        return false;
    }
}
