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
public class Bus extends Vehicle{
    private int sittingCapacity;
    private int standingCapacity;

    public Bus(){
            super();
            sittingCapacity = 0;
            standingCapacity = 0;
    }

    public Bus(String rN, String own, int sitCap, int standCap){
            super(rN, own);
            sittingCapacity = sitCap;
            standingCapacity = standCap;
    }

    public void setSittingCapacity(int sitCap){
            sittingCapacity = sitCap;
    }

    public void setStandingCapacity(int standCap){
            standingCapacity = standCap;
    }

    public int getSittingCapacity(){
            return sittingCapacity;
    }

    public int getStandingCapacity(){
            return standingCapacity;
    }

    public String toString(){
            return "Bus "+regNo+" owned by "+owner+" with sitting capacity: "+sittingCapacity+" and standing capacity: "+standingCapacity;
    }
}
