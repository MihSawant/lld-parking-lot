package services;

import model.Customer;
import system.ParkingLot;


import java.util.List;
import java.util.Map;

public class DisplayBoard {

    Map<java.lang.Integer, List<Customer>> map;
    public DisplayBoard(){
        map = new ParkingLot().getLot();
    }

    public void printLot(){
        map.forEach((floor, spots) -> System.out.println(floor+" "+ spots));
    }

}
