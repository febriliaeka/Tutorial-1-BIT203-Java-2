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

import java.util.Scanner;

public class Tutor1 {
    public static void main(String[] args){
        Scanner ip = new Scanner (System.in);
        
        String nama;
        int jmlSurvey;
        double paid;
        
        System.out.println("Daily pay");
        System.out.print("\nNama: ");
        nama = ip.next();
        System.out.print("Jumlah survey: ");
        jmlSurvey = ip.nextInt();
        
        if (jmlSurvey < 5){
            paid = jmlSurvey*10.00;
            System.out.println("\n"+nama + "'s daily paid is RM"+ paid);
        }
        else if (jmlSurvey == 5){
            System.out.println("\n"+nama+"'s daily paid is RM70.00");

        }
        else if (jmlSurvey > 5){
            double sisa = (jmlSurvey % 5)*10.00;
            double dpaid = (jmlSurvey / 5)*70.00;
            paid = sisa+dpaid;
            System.out.println("\n"+nama+"'s daily paid is RM"+paid);
        }
    }
    
        
}
