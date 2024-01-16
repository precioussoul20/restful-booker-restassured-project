package com.restful.booker.model;

import java.util.HashMap;

public class BookingPojo {

    private String firstName;
    private  String lastName;
    private int totalPrice;
    private boolean depositPaid;
    private String additionalNeeds;
    private HashMap<String,String> bookingDates;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDepositPaid() {
        return depositPaid;
    }

    public void setDepositPaid(boolean depositPaid) {
        this.depositPaid = depositPaid;
    }

    public String getAdditionalNeeds() {
        return additionalNeeds;
    }

    public void setAdditionalNeeds(String additionalNeeds) {
        this.additionalNeeds = additionalNeeds;
    }

    public HashMap<String, String> getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(HashMap<String, String> bookingDates) {
        this.bookingDates = bookingDates;
    }





}
