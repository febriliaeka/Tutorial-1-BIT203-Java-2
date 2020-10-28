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
public class CashPayment extends Payment{
    public CashPayment(){
        super();
    }
    
    public CashPayment(double amount){
            super(amount);
    }

    public String toString(){
            return "Cash payment "+ super.toString();
    }
}
