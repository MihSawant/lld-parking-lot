package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingTicket {

    private String no;
    private LocalDateTime dateTime;

    public ParkingTicket(){
        this.no = generateNo();
        this.dateTime = LocalDateTime.now();
    }

    private String generateNo() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public String getTicketNo(){
        return this.no;
    }
    public String getDateAndTime(){
        return this.dateTime.toString();
    }
}
