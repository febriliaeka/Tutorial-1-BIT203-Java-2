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

public class Room {
    String name;
    int noOfChairs;
    boolean isBooked;
    ArrayList<Dimension> dimension = new ArrayList<Dimension>();
    ArrayList<Window> window = new ArrayList<Window>();
    
    public Room(String inName, int inNoOfChairs, 
            boolean inBooked, Dimension inDimension, Window inWindow){
        name = inName;
        noOfChairs = inNoOfChairs;
        isBooked = inBooked;
        dimension.add(inDimension);
        window.add (inWindow);
    }
    
    public Room(){
        name = "";
        noOfChairs = 0;
        isBooked = true;
    }
    
    public void setName(String inName){
        name = inName;
    }
    
    public void setNoOfChairs(int inNoOfChairs){
        noOfChairs = inNoOfChairs;
    }
    
    public void setIsBooked(boolean inBooked){
        isBooked = inBooked;
    }
    
    public void setDimension(ArrayList<Dimension>inDimension){
        dimension = inDimension;
    }
    
    public void setWindow(ArrayList<Window>inWindow){
        window = inWindow;
    }
    
    public String getName(){
        return name;
    }
    
    public int getNoOfChairs(){
        return noOfChairs;
    }
    
    public boolean getIsBooked(){
        return isBooked;
    }
    
    public ArrayList<Dimension> getDimension(){
        return dimension;
    }
    
    public ArrayList<Window> getWindow(){
        return window;
    }
    
    public String toString(){
        return "Room "+name+" with "+dimension+
                " (in m), with "+window.toString()+" and "+
                noOfChairs+" chairs, and is already booked: "+isBooked;
    }
}
