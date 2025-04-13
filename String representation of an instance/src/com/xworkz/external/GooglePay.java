package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class GooglePay extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public GooglePay(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "GooglePay{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 2156;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof GooglePay){
                GooglePay googlePay=this;
                GooglePay googlePay1=(GooglePay) obj;
                if (googlePay.name.equals(googlePay1.name) && googlePay1.cardNo==googlePay.cardNo && googlePay1.date==googlePay.date){
                    return true;
                }

            }
        }
        return false;
    }
}
