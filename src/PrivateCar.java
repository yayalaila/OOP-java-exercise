public class PrivateCar extends Vehicle {

    public PrivateCar(String chassisNumber, String ownerName) {
        super(chassisNumber, ownerName);
    }

    @Override
    public void payAnnualTax() {
        System.out.println("PrivateCar | Owner: " + ownerName +
                " | Chassis: " + getChassisNumber() +
                " | Tax: 25000 CFA");
    }
}