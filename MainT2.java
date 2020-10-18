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

public class MainT2 {
    public static void main(String[] args){
        String inDirection, inName;
        int inWidth=0, inLength=0, inNoOfChairs=0;
        boolean inBooked;
        
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Direction of window: ");
        inDirection = ip.next();
        Window win = new Window(inDirection);
        
        System.out.print("Width of room: ");
        inWidth = ip.nextInt();
        System.out.print("Length of room: ");
        inLength = ip.nextInt();
        Dimension dim = new Dimension(inWidth, inLength);
        
        System.out.print("Name of room: ");
        inName = ip.next();
        System.out.print("Number of chairs: ");
        inNoOfChairs = ip.nextInt();
        Room rum = new Room(inName,inNoOfChairs,true,dim,win);
        System.out.println(rum.toString());
    }
}
