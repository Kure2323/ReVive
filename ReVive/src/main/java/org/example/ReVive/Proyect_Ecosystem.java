package org.example.ReVive;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.ReVive.interfaces.ICheck;


import java.time.LocalDate;

@ToString
public class Proyect_Ecosystem implements ICheck {
    public int numId = 0;
    @Getter
    private int id;
    @Getter @Setter
    private String eco_type;
    @Getter
    private String proj_name;
    private String localization;
    private LocalDate restaurationDate;

    public Proyect_Ecosystem (String eco_type, String proj_name, String localization){
        id=checkId();
        numId++;
        this.eco_type = checkType(eco_type);
        this.proj_name = this.proj_name;
        this.localization=localization;
        restaurationDate = LocalDate.now();
    }

    public int checkId(){
        return numId;
    }

    /**
     * Comprobamos que el tipo de ecosistema esté dentro del los tipos disponibles.
     * @param eco_type
     * @return tipo de ecosistema dentro del rango.
     */
    public String checkType(String eco_type){
        if (eco_type.equalsIgnoreCase("taiga") || eco_type.equalsIgnoreCase("jungle") ||
                eco_type.equalsIgnoreCase("birch forest") || eco_type.equalsIgnoreCase("valley")){
            return eco_type;
        } else {
            return null;
        }
    }

}
