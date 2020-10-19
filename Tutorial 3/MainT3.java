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

public class MainT3 {
    public static void main(String[] args){
        String rN,own;
        int sC, sitCap, standCap;
        
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Car's reg number: ");
        rN = ip.next();
        System.out.print("Your name: ");
        own = ip.next();
        System.out.print("Car's seat capacity: ");
        sC = ip.nextInt();
        Car carr = new Car(rN, own, sC);
        System.out.println(carr.toString());
        
        System.out.print("\nBus's reg number: ");
        rN = ip.next();
        System.out.print("Your name: ");
        own = ip.next();
        System.out.print("Bus's sitting capacity: ");
        sitCap = ip.nextInt();
        System.out.print("Bus's standing capacity: ");
        standCap = ip.nextInt();
        Bus buss = new Bus(rN, own, sitCap, standCap);
        System.out.println(buss.toString());
    }
}
