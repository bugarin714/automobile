/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author juan
 */
public class Car1 {
    private int Doors;
    private int Cylinders;
    private int Transmission;
    private String x_Color;
    private String Name;
    
   
   public void SetNumberOfDoors(int d){
    Doors = d;
   }    
    public void SetNumberOfCylinders(int c){
       Cylinders = c;
    }
    public void SetTransmission(int t){
        Transmission = t;
    }
    public void SetColor(String color){
        x_Color = color;
    }
    public void SetName(String name){
        Name = name;
    }
    public String about(){
        return "the type of car you are building is a " + x_Color + " " + Doors + "Door" + " Named " + Name ;
    }

    
    }
 

