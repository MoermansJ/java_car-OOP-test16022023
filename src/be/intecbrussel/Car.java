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

    private void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getDriver() {
        return this.driver.toString();
    }

    public void setLightStatus(boolean lightStatus) {
        this.lightStatus = lightStatus;
    }

    public boolean getLightStatus() {
        return lightStatus;
    }


    //custom methods
    public void speedUp() {
        int newVelocity = currentVelocity + 5;

        if (newVelocity < topSpeed) {
            setCurrentVelocity(newVelocity);
        } else {
            setCurrentVelocity(topSpeed);
        }
    }

    public void slowDown() {
        int newVelocity = currentVelocity - 5;

        if (newVelocity > 0) {
            setCurrentVelocity(newVelocity);
        } else {
            setCurrentVelocity(0);
        }
    }

    public void repaint(String colour) {
        setColour(colour);
    }

    public void repair() {
        System.out.println("Repair cost is " + random.nextInt(100, 301));
    }

    public void toggleLights() {
        setLightStatus(!getLightStatus());
        System.out.println("The lights are " + (getLightStatus() ? "on" : "off"));
    }

    public void assignDriver(Driver driver) {
        this.driver = driver;
    }

//    private String generateLicensePlate() {
//        return driver.substring(0, 3).toUpperCase() + "-" + random.nextInt(100, 1000);
//    }

    private String generateLicensePlate() {
        //generating 3 random uppercase letter characters
        char firstChar = (char) random.nextInt(65, 91);
        char secondChar = (char) random.nextInt(65, 91);
        char thirdChar = (char) random.nextInt(65, 91);

        return firstChar + "" + secondChar + "" + thirdChar + "-" + random.nextInt(100, 1000);
    }


    //static method(s)
    public static int getCarCounter() {
        return carCounter;
    }


    //overrides
    @Override
    public String toString() {
        return "Colour: " + colour + " topSpeed: " + topSpeed + " horsePower: " + horsePower + " currentVelocity: " + currentVelocity;
    }
}
