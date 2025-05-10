package org.example.ReVive.Specie;

public class Bird extends Specie{

    private String typeBreak;
    private String migrateSeason;

    public Bird(String specieID, String commonName, String scientName, boolean dangerSpecies, String location, String typeBreak, String migrateSeason) {
        super(specieID, commonName, scientName, dangerSpecies, location);
        this.typeBreak = typeBreak;
        this.migrateSeason = migrateSeason;

    }

    public String getTypeBreak() {
        return typeBreak;
    }

    public String getMigrateSeason() {
        return migrateSeason;
    }
}
