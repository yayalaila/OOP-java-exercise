import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new PrivateCar("CH123", "Mary"));
        vehicles.add(new CommercialTruck("CH456", "John", 100000));
        vehicles.add(new PrivateCar("CH789", "Johny"));
        vehicles.add(new PrivateCar("CH910", "Salif"));

        for (Vehicle v : vehicles) {
            v.payAnnualTax();
        }
    }
}