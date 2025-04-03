package org.example.ReVive;

import org.example.ReVive.interfaces.ICheck;

public class Donor implements ICheck {

    private String donorName;
    private String surname1;
    private String surname2;
    private int donorPhone;
    private int donorAge;
    private double totalDonated;
    private int id;

    public Donor(double totalDonated, int donorAge, int donorPhone, String surname2, String surname1, String donorName) {
        id = checkId();
        this.totalDonated = totalDonated;
        this.donorAge = donorAge;
        this.donorPhone = donorPhone;
        this.surname2 = surname2;
        this.surname1 = surname1;
        this.donorName = donorName;
    }

    @Override
    public int checkId() {
        return id++;
    }
}
