package Pojo;

import java.util.Date;

public class Transaction {
    private String from;
    private String to;
    private double amount;
    private Date date;

    public Transaction(String from , String to, double amount){
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.date = new Date();
    }


    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
