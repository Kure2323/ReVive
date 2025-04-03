package org.example.ReVive;

import org.example.ReVive.interfaces.ICheck;

public class Employee implements ICheck {

    private int id;
    private String name;
    private String surname1;
    private String surname2;
    private int phone;
    private int age;
    private String job;
    private Organization organization;

    public Employee(String name, String surname1, String surname2, int phone, int age, String job, Organization organization) {
        id = checkId();
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.phone = phone;
        this.age = age;
        this.job = job;
        this.organization = organization;
    }

    @Override
    public int checkId() {
        return id++;
    }
}
