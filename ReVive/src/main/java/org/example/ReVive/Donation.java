package org.example.ReVive;

import org.example.ReVive.interfaces.ICheck;

import java.util.ArrayList;

public class Donation implements ICheck {

    public int numId = 0;
    private int id;
    private ArrayList<Organization> organizations;
    private ArrayList<Donor> donors;
    private double quantityDonated;

    public Donation(double quantityDonated) {
        id=checkId();
        this.quantityDonated=quantityDonated;
        organizations = new ArrayList<>();
        donors = new ArrayList<>();
    }

    @Override
    public int checkId() {
        return numId++;
    }
}
