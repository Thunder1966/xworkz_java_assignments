package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class GiftCard extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public GiftCard(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "GiftCard{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 74152;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof GiftCard){
                GiftCard giftCard=this;
                GiftCard giftCard1=(GiftCard) obj;
                if (giftCard1.name.equals(giftCard.name) && giftCard1.cardNo==giftCard.cardNo && giftCard1.date==giftCard.date){
                    return true;
                }

            }
        }
        return false;
    }
}
