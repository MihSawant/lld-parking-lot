package system;

import model.Customer;

import java.util.*;

public class ParkingLot {

    // Using parking lot as a Map so Floor no and parking spots on that floor
    /*
        In this case i am assuming that Their are 3 Floors and Each floor has 6 spots
        so in total 18 spots
     */
    private Map<java.lang.Integer, List<Customer>> parkingLot;
    public ParkingLot(){
        parkingLot = new HashMap<>();
        parkingLot.put(1, new ArrayList<Customer>(8));
        parkingLot.put(2, new ArrayList<Customer>(8));
        parkingLot.put(3, new ArrayList<Customer>(8));
    }


    public void park(Customer car){
        Collection<List<Customer>> spots = parkingLot.values();
        long count = spots.stream()
                .map(List::size)
                .count();
        if(count > 24) System.out.println("Sorry, All the parking spots are full");
        else{
            System.out.println("Place available");
        }
    }

    public int getSize(){
        return parkingLot.size();
    }

    public Map<java.lang.Integer, List<Customer>> getLot(){
        return Map.copyOf(parkingLot);
    }

}
