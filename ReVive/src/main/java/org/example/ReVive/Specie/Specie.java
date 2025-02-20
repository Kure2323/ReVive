package org.example.ReVive.Specie;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
abstract class Specie {

    @NonNull @Getter
    private String specieID;
    @Getter
    private String commonName;
    @Getter @NonNull
    private String cientName;
    @Getter @NonNull
    private boolean dangerSpecies;
    @Getter @NonNull
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
