package model;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Customer {
    private String name;

    // HAS-A relationship
    private ParkingTicket parkingTicket;

    private LocalTime parkingTime;

    private String vehicleNo;

    public Customer(String name, String vehicleNo){
        this.name = name;
        this.parkingTicket = new ParkingTicket();
        this.parkingTime = LocalTime.now(ZoneId.systemDefault());
        this.vehicleNo = vehicleNo;
    }

    public void printCustomerDetails(){
        System.out.printf("Name: %s, Ticket: %s, Vehicle Number: %s%n",
                name, parkingTicket.getTicketNo(), vehicleNo);
    }

    public String toString(){

        return String.format("Name: %s, Ticket: %s, In-Time: %s ,  Vehicle Number: %s%n",
        name, parkingTicket.getTicketNo(),
                parkingTime.format(DateTimeFormatter.ofPattern("HH:mm")) ,
                vehicleNo);
    }


}
