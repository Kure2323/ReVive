package org.example.ReVive;

import org.example.ReVive.interfaces.ICheck;

import java.util.ArrayList;
import java.util.List;

public class Organization implements ICheck {

    private int organizationID;
    private String organizationName;
    private int organizationPhone;
    private List<Proyect_Ecosystem> projectID;


    public Organization(String organizationName, int organizationPhone) {
        this.organizationID = checkId();
        this.organizationPhone = organizationPhone;
        this.organizationName = organizationName;
        projectID = new ArrayList<>();
    }


    @Override
    public int checkId() {
        return organizationID++;
    }

    public void agregarProyecto(Proyect_Ecosystem p) {
        projectID.add(p);
    }

    public void borrarProyecto(Proyect_Ecosystem p) {
        projectID.remove(p);
    }



}
