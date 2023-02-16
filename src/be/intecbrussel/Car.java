package be.intecbrussel;

import java.util.Random;

public class Car {
    //instance(s)
    private Random random = new Random();


    //field(s)
    static int carCounter = 0;


    //properties
    private String colour = "white";
    private int topSpeed = 120;
    private int horsePower = 150;
    private int currentVelocity = 0;
    private boolean lightStatus = false;
    private Driver driver = new Driver();
    private String licensePlate = generateLicensePlate();


    //constructors
    public Car() {
        carCounter++;
    }

    public Car(String colour, int topSpeed, int horsePower) {
        setColour(colour);
        setTopSpeed(topSpeed);
        setHorsePower(horsePower);
        carCounter++;
    }


    //getters & setters
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getDriver() {
        return this.driver.toString();
    }


    //custom methods
    public void speedUp() {
        int newVelocity = currentVelocity + 5;

        if (newVelocity < topSpeed) {
            currentVelocity = newVelocity;
        } else if (newVelocity >= topSpeed) {
            currentVelocity = topSpeed;
        }
    }

    public void slowDown() {
        int newVelocity = currentVelocity - 5;

        if (newVelocity > 0) {
            currentVelocity = newVelocity;
        } else if (newVelocity <= 0) {
            currentVelocity = 0;
        }
    }

    public void repaint(String colour) {
        setColour(colour);
    }

    public void repair() {
        System.out.println("Repair cost is " + random.nextInt(100, 301));
    }

    public void toggleLights() {
        lightStatus = !lightStatus;
        System.out.println("The lights are " + (lightStatus ? "on" : "off"));
    }

    public void assignDriver(Driver driver) {
        this.driver = driver;
    }

//    private String generateLicensePlate() {
//        return driver.substring(0, 3).toUpperCase() + "-" + random.nextInt(100, 1000);
//    }

    private String generateLicensePlate() {
        char firstChar = (char) random.nextInt(65, 91);
        char secondChar = (char) random.nextInt(65, 91);
        char thirdChar = (char) random.nextInt(65, 91);

        return firstChar + "" + secondChar + "" + thirdChar + "-" + random.nextInt(100, 1000);
    }

    //static methods
    public static int getCarCounter() {
        return carCounter;
    }


    //overrides
    @Override
    public String toString() {
        return "Colour: " + colour + " topSpeed: " + topSpeed + " horsePower: " + horsePower + " currentVelocity: " + currentVelocity;
    }
}
