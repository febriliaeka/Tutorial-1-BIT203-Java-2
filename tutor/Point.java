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
public class Point {
    private double x;
    private double y;
    
    public Point(double cX, double cY){
        x = cX;
        y = cY;
    }
    
    public Point(){
        x=0;
        y=0;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double cX){
        x = cX;
    }
    
    public void setY(double cY){
        y = cY;
    }
}
