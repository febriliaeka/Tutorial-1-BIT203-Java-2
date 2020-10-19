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
public class Vehicle {
    String regNo;
    String owner;

    public Vehicle(){
            regNo = "";
            owner = "";
    }

    public Vehicle(String rN, String own){
            regNo = rN;
            owner = own;
    }

    public void setRegNo(String rN){
            regNo = rN;
    }

    public void setOwner(String own){
            owner = own;
    }

    public String getRegNO(){
            return regNo;
    }

    public String getOwner(){
            return owner;
    }

    public String toString(){
            return regNo+" owned by " +owner;
    }
}
