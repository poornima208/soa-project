/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

import java.util.Date;

/**
 *
 * @author Poornima
 */
public class Payment {
     String paymentId; 
   String OrderId;
   String paymentMethodId;
   Double paymentAmount;
   String  paymentDate;
   String creditCard ; 
   long creditCardNumber; 
   String cardHolderName;
   String creditCardExpiryDate;
   int ccv ; 

    public String getOrderId() {
        return OrderId;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setCreditCardExpiryDate(String creditCardExpiryDate) {
        this.creditCardExpiryDate = creditCardExpiryDate;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }
  

    public String getPaymentId() {
        return paymentId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCreditCardExpiryDate() {
        return creditCardExpiryDate;
    }

    public int getCcv() {
        return ccv;
    }
    
}
