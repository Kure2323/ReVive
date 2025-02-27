package org.example.ReVive.Specie;

public class Bird extends Specie{

    private String typeBreak;
    private String migrateSeason;

    public Bird(String specieID, String commonName, String cientName, boolean dangerSpecies, String location, String typeBreak, String migrateSeason) {
        super(specieID, commonName, cientName, dangerSpecies, location);
        this.typeBreak = typeBreak;
        this.migrateSeason = migrateSeason;
    }


}
