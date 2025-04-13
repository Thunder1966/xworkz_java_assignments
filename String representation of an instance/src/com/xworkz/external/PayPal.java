package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class PayPal extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public PayPal(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 7416;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof PayPal){
                PayPal payPal=this;
                PayPal payPal1=(PayPal) obj;
                if (payPal1.name.equals(payPal.name) && payPal1.cardNo==payPal.cardNo && payPal1.date==payPal.date){
                    return true;
                }

            }
        }
        return false;
    }
}
