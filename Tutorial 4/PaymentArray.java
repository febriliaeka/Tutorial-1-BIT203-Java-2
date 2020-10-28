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
public class PaymentArray {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        Payment[] listPay = new Payment[8];

        int numCashPay = 0;

        for(int p=0; p < listPay.length; p++){
            System.out.print("Sales amount? ");
            double amount = key.nextDouble();
            key.nextLine();

            System.out.print("Payment type? <Cash> or <Credit> ");
            String pay = key.nextLine();

            if(pay.equalsIgnoreCase("cash")){
                listPay[p] = new CashPayment(amount);
                System.out.println("\n" + listPay[p] +"\n");
                numCashPay++;
            }
            else if (pay.equalsIgnoreCase("credit")){
                System.out.print("Credit Card Holder: ");
                String nameCard = key.nextLine();
                System.out.print("Expire on: (mm/yy) ");
                String date = key.nextLine();
                System.out.print("Credit Card Number: ");
                String numCard = key.nextLine();
                
                listPay[p] = new CreditCardPayment(amount, nameCard, date, numCard);
                System.out.println(listPay[p] + "\n");
            }
            else{
                System.out.println("Incorrect Payment Type! Enter <Cash> or <Credit>\n");
                p--;
            }
        }

        double totalAmount = 0.0;
        int numLessPay = 0;
        String CreditCardExpired = "";

        for(int i=0; i<listPay.length; i++){
            totalAmount += listPay[i].getAmount();
        }
        
        for(int m=0; m<listPay.length; m++){
            if(listPay[m].getAmount()< 300){
                numLessPay += 1;
            }
        }

        for (int l =0; l<listPay.length; l++){
            if(listPay[l] instanceof CreditCardPayment){
                String years = ((CreditCardPayment)listPay[l]).getExpiredDate();
                if(years.substring(3).equals("20")){
                    CreditCardExpired += listPay[l] + "\n";
                }
            }
        }

        System.out.println("Summarised information about 8 payments: ");
        System.out.println("Total amount collected: " +totalAmount);
        System.out.println("Number of cash payments: " +numCashPay);
        System.out.println("Number of payments (< 300): " +numLessPay);
        System.out.println("Display credit card payments which are expired on year(15):\n" +CreditCardExpired);

        key.close();
    }
    
}
