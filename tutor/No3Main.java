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

public class No3Main {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        
        Point po = new Point();
        Circle ci = new Circle();
        
        System.out.print("Point(x): ");
        po.setX(ip.nextDouble());
        System.out.print("Point(y): ");
        po.setY(ip.nextDouble());
        
        System.out.print("\nCircle(x): ");
        ci.centre.setX(ip.nextDouble());
        System.out.print("Circle(y): ");
        ci.centre.setY(ip.nextDouble());
        System.out.print("Circle(r): ");
        ci.setRadius(ip.nextDouble());
        
        double x = po.getX() - ci.centre.getX();
        double y = po.getY() - ci.centre.getY();
        double dm = Math.pow(x, 2)-Math.pow(y, 2);
        
        if(dm<ci.radius){
            System.out.println("\ninside the circle");
        }
        
        else if(dm==ci.radius){
            System.out.println("\non the circle");
        }
        
        else{
            System.out.println("\noutside the circle");
        }
    }
}
