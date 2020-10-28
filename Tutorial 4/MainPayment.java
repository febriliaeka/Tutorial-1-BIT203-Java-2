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

import java.util.*;

public class MainPayment {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        boolean ext = false;

        while(!ext){
            System.out.print("Sales amount? (0 to exit) ");
            double amount = key.nextDouble();
            key.nextLine();

            if(amount != 0)
            {
                System.out.print("Payment type? <Cash> or <Credit> ");
                String pay = key.nextLine();

                if(pay.equalsIgnoreCase("cash")){
                    System.out.println("\n" + new CashPayment(amount) +"\n");
                }
                else if (pay.equalsIgnoreCase("credit"))
                {
                    System.out.print("Credit Card Holder: ");
                    String nameCard = key.nextLine();
                    System.out.print("Expire on: (mm/yy) ");
                    String date = key.nextLine();
                    System.out.print("Credit Card Number: ");
                    String numCard = key.nextLine();
                    
                    System.out.println(new CreditCardPayment(amount, nameCard, date, numCard) + "\n");
                }
                else
                    System.out.println("Incorrect Payment Type! Enter <Cash> or <Credit>\n");
            }
            else
                    ext = true;

        }

        System.out.println("\nThank u!");
        key.close();
    }
}
