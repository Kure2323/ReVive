package org.example.ReVive;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppReVive {

    static Proyect_Ecosystem proyecto = new Proyect_Ecosystem("Dessert", "FreeDessert", "Africa");
    static Organization organization = new Organization("EEOA", 646578710);
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        organization.agregarProyecto(proyecto);
        mainMenu();
        darDeAlta();




    }

    public static void mainMenu() {
        System.out.println();
        System.out.println("***  Main Menu  ***");
        System.out.println("    1. Go to Species");
        System.out.println("    2. Go to Donations");
        System.out.println("    3. Go to Organizations");
        System.out.println("    4. Go to Proyects");
        System.out.println("    5. Register and Edit pannel");
        System.out.println();

        try{
            switch (in.nextInt()) {
                case 1:
                    //Enviar a menú de Species
                    break;
                case 2:
                    //Enviar a Donations
                    break;
                case 3:
                    //Enviar a Organizations
                    break;
                case 4:
                    //Enviar a Proyects
                case 5:
                    //LLeva al panel de registro y edición de usuarios (Volunteer, Donor y Employee)
                    darDeAlta();
                    break;
            }
        } catch (InputMismatchException e) {
            in.nextLine();
            mainMenu();
        }


    }

    private static void species() {

        System.out.println();
        System.out.println("***  Species  ***");
        System.out.println("    1. Bird");
        System.out.println("    2. Mammal");
        System.out.println("    3. Reptile");
        System.out.println("    0. Go back");
        System.out.println();

        

    }


    private static void darDeAlta() {

        System.out.println();
        System.out.println("=== Register menu ===");
        System.out.println("    1. Employee");
        System.out.println("    2. Volunteer");
        System.out.println("    3. Donor");
        System.out.println("Type a number to select:");
        System.out.println();

        try{
            switch (in.nextInt()) {
                case 1:
                    //Enviar a employee
                    break;
                case 2:
                    //Enviar a volunteer
                    break;
                case 3:
                    //Enviar a donor
            }
        } catch (InputMismatchException e) {
            in.nextLine();
            darDeAlta();
        }


    }


}
