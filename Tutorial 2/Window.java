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
public class Window {
    String direction;
    
    public Window(){
        direction = "";
    }
    
    public Window(String inDirection){
        direction = inDirection;
    }
    
    public void setDirection(String inDirection){
        direction = inDirection;
    }
    
    public String getDirection(){
        return direction;
    }
    
    public String toString(){
        return "window facing "+direction;
    }
}
