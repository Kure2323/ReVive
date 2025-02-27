package org.example.ReVive.Specie;


public class Mammal extends Specie{

    private String hair;
    private boolean marsupial;

    public Mammal(String specieID, String commonName, String cientName, boolean dangerSpecies, String location,
                  String hair, boolean marsupial) {
        super(specieID, commonName, cientName, dangerSpecies, location);
        this.hair = hair;
        this.marsupial = marsupial;
    }




}
