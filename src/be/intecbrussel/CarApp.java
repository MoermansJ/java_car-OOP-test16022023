package be.intecbrussel;

import java.util.Random;

public class CarApp {
    /*
    Maak een CarApp klasse aan die onze main methode zal bevatten. Hier zullen we om te testen 3 Auto's
    aanmaken. Zet van de eerste Auto de kleur op paars. Laat de 2de auto maximum 70 rijden en heeft de kleur
    groen. Auto 3 zal getuned zijn met een 200 hp motor een maximum snelheid van 160 de kleur is geel.
    */

    public static void main(String[] args) {
        Car firstCar = new Car();
        Car secondCar = new Car();
        Car thirdCar = new Car("Yellow", 160, 200);

        firstCar.setColour("Purple");
        secondCar.setTopSpeed(70);
        secondCar.setColour("Green");
    }
}
