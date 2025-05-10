package org.example.ReVive.Specie;

public class Reptile extends Specie{

    private boolean poisonous;
    private boolean colorChange;

    public Reptile(String specieID, String commonName, String scientName, boolean dangerSpecies, String location, boolean poisonous, boolean colorChange) {
        super(specieID, commonName, scientName, dangerSpecies, location);
        this.poisonous = poisonous;
        this.colorChange = colorChange;
    }

}
