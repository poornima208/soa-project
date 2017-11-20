/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

/**
 *
 * @author Poornima
 */
public class EmployeePayment {
    private String PaymentID;
    private String EmployeeID;
    private int PaymentAmount;
    private String PaymentDate;
    private String Paymenttype;

    /**
     * @return the PaymentID
     */
    public String getPaymentID() {
        return PaymentID;
    }

    /**
     * @param PaymentID the PaymentID to set
     */
    public void setPaymentID(String PaymentID) {
        this.PaymentID = PaymentID;
    }

    /**
     * @return the EmployeeID
     */
    public String getEmployeeID() {
        return EmployeeID;
    }

    /**
     * @param EmployeeID the EmployeeID to set
     */
    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    /**
     * @return the PaymentAmount
     */
    public int getPaymentAmount() {
        return PaymentAmount;
    }

    /**
     * @param PaymentAmount the PaymentAmount to set
     */
    public void setPaymentAmount(int PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    /**
     * @return the PaymentDate
     */
    public String getPaymentDate() {
        return PaymentDate;
    }

    /**
     * @param PaymentDate the PaymentDate to set
     */
    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    /**
     * @return the Paymenttype
     */
    public String getPaymenttype() {
        return Paymenttype;
    }

    /**
     * @param Paymenttype the Paymenttype to set
     */
    public void setPaymenttype(String Paymenttype) {
        this.Paymenttype = Paymenttype;
    }
    
}
