/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor;

/**
 *
 * @author ASUS
 */
public class CreditCardPayment extends Payment{
    private String name;
    private String expiredDate;
    private String number;

    public CreditCardPayment()
    {
            super();
            name = "";
            expiredDate = "";
            number = "";
    }
    
    public CreditCardPayment(double amount, String name, 
            String expiredDate, String number)
    {
            super(amount);
            this.name = name;
            this.expiredDate = expiredDate;
            this.number = number;
    }

    public void setName(String name)
    {
            this.name = name;
    }

    public void setExpiredDate(String expiredDate)
    {
            this.expiredDate = expiredDate;
    }

    public void setNumber(String number)
    {
            this.number = number;
    }

    public String getName()
    {
            return name;
    }

    public String getExpiredDate()
    {
            return expiredDate;
    }

    public String getNumber()
    {
            return number;
    }

    public String toString()
    {
            return "\nUsing card ("+name+" ["+number+"] exp: "+expiredDate+") \nfor credit-card payment, "+super.toString();
    }
}
