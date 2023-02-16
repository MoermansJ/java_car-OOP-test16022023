package be.intecbrussel;

public class Driver {
    //properties
    private String driverName = "unknown";


    //constructors
    public Driver() {

    }

    public Driver(String driverName) {
        setDriverName(driverName);
    }


    //getters & setters
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }


    //custom methods
    public void assignDriver(String driverName) {
        //naam van de bestuurder moet minstens 5 karakters lang zijn en mag niet enkel spaties bevatten
        //dwz minstens 4 spaties + 1 ander karakter is OK
        if (driverName.trim().length() >= 1) {
            this.driverName = driverName;
        } else {
            System.out.println("Niet toegestaan.");
        }
    }

    //overrides
    @Override
    public String toString() {
        return "driverName: " + driverName;
    }
}
