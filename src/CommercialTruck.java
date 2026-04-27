public class CommercialTruck extends Vehicle {

    private double weight;

    public CommercialTruck(String chassisNumber, String ownerName, double weight) {
        super(chassisNumber, ownerName);
        this.weight = weight;
    }

    @Override
    public void payAnnualTax() {
        double tax = weight * 0.05;

        System.out.println("CommercialTruck | Owner: " + ownerName +
                " | Chassis: " + getChassisNumber() +
                " | Tax: " + tax + " CFA");
    }
}