package org.example.ReVive;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import org.example.ReVive.interfaces.ICheck;

@ToString
public class Donation implements ICheck {

    public int numId = 0;
    private int id;
    private int organizationId;
    private int donatorId;
    @Getter @Setter
    private double quantityDonated;

    public Donation(double quantityDonated) {
        this.quantityDonated=quantityDonated;


    }

    @Override
    public int checkId() {
        return numId++;
    }
}
