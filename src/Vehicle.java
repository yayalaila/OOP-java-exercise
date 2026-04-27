public abstract class Vehicle {

    private String chassisNumber;
    protected String ownerName;

    public Vehicle(String chassisNumber, String ownerName) {
        this.chassisNumber = chassisNumber;
        this.ownerName = ownerName;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public abstract void payAnnualTax();
}