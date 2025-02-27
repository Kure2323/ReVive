package org.example.ReVive.Specie;

abstract class Specie {


    private String specieID;
    private String commonName;
    private String cientName;
    private boolean dangerSpecies;
    private String location;

    //Usado para generar la ID
    private static int cantidad = 0;

    public Specie(String specieID, String commonName, String cientName, boolean dangerSpecies, String location){
        this.location=location;
        this.cientName=cientName;
        this.commonName=commonName;
        this.specieID=specieID;
        this.dangerSpecies=dangerSpecies;
    }

    private int generateId() {

        return cantidad++;
    }

}
