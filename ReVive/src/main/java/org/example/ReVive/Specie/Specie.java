package org.example.ReVive.Specie;

import java.util.ArrayList;
import java.util.List;

public abstract class Specie {


    private String specieID;
    private String commonName;
    private String scientName;
    private boolean dangerSpecies;
    private String location;

    public static List<Specie> specieList = new ArrayList<>();

    //Usado para generar la ID
    private static int cantidad = 0;

    public Specie(String specieID, String commonName, String scientName, boolean dangerSpecies, String location){
        this.location=location;
        this.scientName=scientName;
        this.commonName=commonName;
        this.specieID=specieID;
        this.dangerSpecies=dangerSpecies;
    }

    public static int generateId() {

        return ++cantidad;
    }

    public String getScientName() {
        return scientName;
    }

    @Override
    public String toString() {
        return "Specie{" +
                "specieID='" + specieID + '\'' +
                ", commonName='" + commonName + '\'' +
                ", scientName='" + scientName + '\'' +
                ", dangerSpecies=" + dangerSpecies +
                ", location='" + location + '\'' +
                '}';
    }
}
