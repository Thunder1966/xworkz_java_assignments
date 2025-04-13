package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class BankTransfer extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public BankTransfer(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "BankTransfer{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 346;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof BankTransfer){
                BankTransfer bankTransfer=this;
                BankTransfer bankTransfer1=(BankTransfer) obj;
                if (bankTransfer1.name.equals(bankTransfer.name) && bankTransfer.cardNo==bankTransfer1.cardNo && bankTransfer1.date==bankTransfer.date){
                    return true;
                }

            }
        }
        return false;
    }
}
