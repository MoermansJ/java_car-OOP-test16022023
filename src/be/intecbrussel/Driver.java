package be.intecbrussel;

public class Driver {
    /*
    Nu zit de driver als String in de Car class, dit gaan we aanpassen door een driver class aan te maken.
    Nu gebruiken we niet meer de String als datatype maar de driver class.
    */

    //properties
    private String name = "unknown";


    //constructors
    public Driver() {

    }

    public Driver(String name) {
        setName(name);
    }


    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //custom methods
    public void assignDriver(String driverName) {
        //naam van de bestuurder moet minstens 5 karakters lang zijn en mag niet enkel spaties bevatten
        //dwz minstens 4 spaties + 1 ander karakter is OK
        if (driverName.trim().length() >= 1) {
            name = driverName;
        } else {
            System.out.println("Niet toegestaan.");
        }
    }

    //overrides
    @Override
    public String toString() {
        return "name: " + name;
    }
}
