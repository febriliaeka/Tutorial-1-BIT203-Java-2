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
public class Circle {
    public Point centre = new Point();
    public double radius;
    
    public Circle(double r, double cX, double cY){
        radius = r;
    }
    
    public Circle(){
        this.centre.setX(0);
        this.centre.setY(0);
        radius=0;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double r){
        radius = r;
    }
}
