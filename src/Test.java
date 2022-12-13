import model.Customer;
import services.DisplayBoard;
import system.ParkingLot;

public class Test {
    public static void main(String[] args) {
        // Adding new Customer
        Customer c = new Customer("Mihir", "MH-98-1121");
        ParkingLot lot = new ParkingLot();
        DisplayBoard board = new DisplayBoard();
        lot.park(c);
        lot.getLot();

    }
}
