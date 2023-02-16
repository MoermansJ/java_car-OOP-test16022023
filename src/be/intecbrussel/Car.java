package be.intecbrussel;

import java.util.Random;

public class Car {
    /*
    Maak een class aan genaamd Car we willen bij het aanmaken van een instantie de volgende eigenschappen
    kunnen meegeven kleur, maximum snelheid en paardenkracht. Wanneer we geen specifieke kleur meegeven
    is de auto standaard wit. De maximale snelheid is standaard 120 en de standaard waarde voor paardenkracht
    is 150. Zorg ervoor dat alle eigenschappen beschermd zijn. maar dat we deze wel kunnen opvragen.
    */

    /*
    Maak een extra variabele aan in de class Car die de huidige snelheid gaat bijhouden. Maak een methode aan
    speedUp en een methode slowDown wanneer deze methode wordt aangeroepen moet de huidige snelheid
    optellen met 5 of verminderen met 5. De huidige snelheid mag nooit meer worden dan maximumsnelheid en
    nooit lager zijn dan 0; Zorg er ook voor dat ik de huidige snelheid kan opvragen. Maak ook nog een methode
    repaint waarmee ik de kleur van mijn wagen kan aanpassen. Maak een methode aan genaamd repair deze
    methode moet een random geheel getal genereren tussen 100 en 300, druk vervolgens het random getal af.
    als volgt: repair cost is 237
    */

    //Zorg ervoor dat het mogelijk is om alle informatie van de wagen af te drukken. met de tostring() methode.

    //Zorg ervoor dat we de mogelijkheid hebben om het aantal wagens op te vragen dat zijn aangemaakt.

    /*
    Zorg ervoor dat we de lichten van onze wagen kunnen aan en uit zetten. Dit door middel van één enkel
    methode toggleLights. Wanneer de lichten uit staan -> zet je deze aan. Als de lichten aan staan -> zet je deze
    uit. druk een boodschap af met de melding of de lichten aan of uit staan.
    */

    /*
    Voeg een extra property toe aan de class Car genaamd driver de standaard waarde is "unknown" Zorg ervoor
    dat ik een bestuurder aan de wagen kan toekennen met de methode assignDriver(String driverName) de
    naam van de bestuurder moet minstens 5 karakters lang zijn en mag niet enkel spaties bevatten anders krijg
    je de melding -> Niet toegestaan.
    */

    /*
    Voeg nog een methode toe generateLicensePlate() deze gebruikt het volgende algoritme om een
    nummerplaat te genereren: De eerste 3 letters van de bestuurder/driver in hoofdletters gevolgd door een
    streepje (-) met een random getal tussen 100 en 999. Voorbeeld: Driver heeft de naam Quinten dan wordt de
    nummerplaat: QUI-385 De nummerplaat moet ook opgevraagd kunnen worden met een get methode.
    */

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
    private String driver = "unknown";
    private String licensePlate = generateLicensePlate();


    //constructors
    public Car() {
        carCounter++;
    }

    public Car(String colour, int topSpeed, int horsePower) {
        this.colour = colour;
        this.topSpeed = topSpeed;
        this.horsePower = horsePower;
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

    //custom methods
    public void speedUp() {
        int newVelocity = currentVelocity + 5;

        if (newVelocity <= topSpeed) {
            currentVelocity = newVelocity;
        }
    }

    public void slowDown() {
        int newVelocity = currentVelocity - 5;

        if (newVelocity >= 0) {
            currentVelocity = newVelocity;
        }
    }

    public void repaint(String colour) {
        this.colour = colour;
    }

    public void repair() {
        System.out.println("Repair cost is " + random.nextInt(100, 301));
    }

    public void toggleLights() {
        lightStatus = !lightStatus;
        System.out.println("The lights are " + (lightStatus ? "on" : "off"));
    }

    public void assignDriver(String driverName) {
        //naam van de bestuurder moet minstens 5 karakters lang zijn en mag niet enkel spaties bevatten
        //dwz minstens 4 spaties + 1 ander karakter is OK
        if (driverName.trim().length() >= 1) {
            driver = driverName;
        } else {
            System.out.println("Niet toegestaan.");
        }
    }

//    public String generateLicensePlate() {
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
