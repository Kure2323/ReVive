package org.example.ReVive;

import org.example.ReVive.interfaces.ICheck;

import java.util.ArrayList;
import java.util.List;

public class Volunteer implements ICheck {
    private int id;
    private String name;
    private String surname1;
    private String surname2;
    private String address;
    private int phone;
    private List<Proyect_Ecosystem> projects;

    public Volunteer(String name, String surname1, String surname2, String address, int phone) {
        id = checkId();
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.address = address;
        this.phone = phone;
        projects = new ArrayList<>();
    }

    @Override
    public int checkId() {
        return id++;
    }
}
