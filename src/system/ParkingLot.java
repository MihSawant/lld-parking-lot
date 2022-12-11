package system;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    // Using parking lot as a Map so Floor no and parking spots on that floor
    /*
        In this case i am assuming that Their are 3 Floors and Each floor has 6 spots
        so in total 18 spots
     */
    private Map<Integer, List<Customer>> parkingLot;
    public ParkingLot(){
        parkingLot = new HashMap<>();
        parkingLot.put(1, new ArrayList<Customer>(8));
        parkingLot.put(2, new ArrayList<Customer>(8));
        parkingLot.put(3, new ArrayList<Customer>(8));
    }

    public int getSize(){
        return parkingLot.size();
    }

}
