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
public class Car extends Vehicle{
    private int seatCapacity;

    public Car(){
            super();
            seatCapacity = 0;
    }

    public Car(String rN, String own, int sC){
            super(rN, own);
            seatCapacity = sC;
    }

    public void setSeatCapacity(int sC){
            seatCapacity = sC;
    }

    public int getSeatCapacity(){
            return seatCapacity;
    }

    public String toString(){
            return "Car "+regNo+" owned by "+owner+" with seat capacity "+seatCapacity;
    }
}
