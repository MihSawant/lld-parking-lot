package model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Ticket {

    private String no;
    private LocalDateTime dateTime;

    public Ticket(){
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
