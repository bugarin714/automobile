/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d;
        String color;
        String name;
        Scanner input = new Scanner(System.in);
        Car1 Automobile = new Car1();
        int cont = 1;
        while (cont == 1){
            System.out.println("Lets begin building a car what will the car be named?");
            name = input.next();
            Automobile.SetName(name);
		System.out.println("Let's choose the color of the car");
		color = input.next();
		Automobile.SetColor(color);
		System.out.println("Next Choose the Number of Doors!");
		d = input.nextInt();
		Automobile.SetNumberOfDoors(d);
		
		//System.out.println(Automobile.about());
		
		System.out.println("Would you like to build another car? If Yes, type 1, if No type 2");
		cont = input.nextInt();
        // TODO code application logic here
    }
  }
}
