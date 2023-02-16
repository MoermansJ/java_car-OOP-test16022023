package be.intecbrussel;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;

public class CarApp {
    public static void main(String[] args) {
        Car firstCar = new Car();
        Car secondCar = new Car();
        Car thirdCar = new Car("Yellow", 160, 200);

        firstCar.setColour("Purple");
        secondCar.setTopSpeed(70);
        secondCar.setColour("Green");

        //tests
        /*
        System.out.println(firstCar + "\n" + secondCar + "\n" + thirdCar);

        firstCar.slowDown(); //starting velocity is already 0
        firstCar.slowDown();
        firstCar.slowDown();
        firstCar.speedUp();
        firstCar.speedUp();
        firstCar.slowDown(); //expected currentVelocity: 5

        Driver d1 = new Driver("     "); //not accepted -> remains unknown
        Driver d2 = new Driver("Jonathan"); //accepted
        d2.setDriverName("     "); //not accepted -> remains "Jonathan"

        Driver d3 = new Driver(" Jan "); //2 spaces and 3 characters -> accepted but gets changed to "Jan"
        d3.setDriverName("  J  "); //4 spaces + 1 character -> accepted but gets changed to "J"

        firstCar.assignDriver(d1);
        secondCar.assignDriver(d2);
        thirdCar.assignDriver(d3);

        firstCar.toggleLights(); //lights are on
        firstCar.toggleLights(); //lights are off again

        secondCar.toggleLights(); //lights are on

        firstCar.repaint("Black"); //any String argument is accepted -> no checks in .repaint()
        firstCar.repaint("Red");
        secondCar.repaint("Orange");

        firstCar.repair(); //String gets generated and printed, no properties are changed
        firstCar.repair();
        secondCar.repair();

        System.out.println(firstCar + "\n" + secondCar + "\n" + thirdCar);
        */

    }
}
