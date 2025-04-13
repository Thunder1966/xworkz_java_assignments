package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class ApplePay extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public ApplePay(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "ApplePay{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 96;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof ApplePay){
                ApplePay applePay=this;
                ApplePay applePay1=(ApplePay) obj;
                if (applePay1.name.equals(applePay.name) && applePay1.cardNo==applePay.cardNo && applePay1.date==applePay.date){
                    return true;
                }

            }
        }
        return false;
    }
}
