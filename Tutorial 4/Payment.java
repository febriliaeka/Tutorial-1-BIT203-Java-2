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
public class Payment {
    public double amount;
	
    public Payment(){
            this.amount = 0.0;
    }
    
    public Payment(double amount){
            this.amount = amount;
    }

    public void setAmount(double amount){
            this.amount = amount;
    }

    public double getAmount(){
            return amount;
    }

    public String toString(){
            return "amount paid is "+amount;
    }
}
