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
public class Dimension {
    int width, length;
    
    public Dimension(){
        width = 0;
        length = 0;
    }
    
    public Dimension(int inWidth, int inLength){
        width = inWidth;
        length = inLength;
    }
    
    public void setWidth(int inWidth){
        width = inWidth;
    }
    
    public void setLength(int inLength){
        length = inLength;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getLength(){
        return length;
    }
    
    public String toString(){
        return "Dimension: "+width +" x "+ length;
    }
}
