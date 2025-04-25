package org.example.ReVive;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppReVive {

    static Proyect_Ecosystem proyecto = new Proyect_Ecosystem("Dessert", "FreeDessert", "Africa");
    static Organization organization = new Organization("EEOA", 646578710);
    static User user;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        organization.agregarProyecto(proyecto);
        signIn();
        mainMenu();




    }

    public static void mainMenu() {

        System.out.println();
        System.out.println("***  Main Menu  ***");
        System.out.println("    1. Go to Species");
        System.out.println("    2. Go to Donations");
        System.out.println("    3. Go to Organizations");
        System.out.println("    4. Go to Proyects");
        System.out.println("    5. Edite your User");
        System.out.println();

        try{
            switch (in.nextInt()) {
                case 1:
                    //Enviar a menú de Species

                    specieMenu();


                    break;
                case 2:
                    //Enviar a Donations
                    break;
                case 3:
                    //Enviar a Organizations
                    break;
                case 4:
                    //Enviar a Proyects
                    break;
                case 5:
                    //Editar user
                    break;

            }
        } catch (InputMismatchException e) {
            in.nextLine();
            mainMenu();
        }

    }

    private static void signIn() {
        System.out.println("***  Sign in  ***");
        System.out.println("Introduce your username, it must be unique");
        String username = in.next();
        System.out.println("Introduce your password " + username);
        String password = in.next();

        user = new User(username, password);
    }

    private static void specieMenu() {
        System.out.println("***  Species Menu  ***");
        System.out.println("    1. Go to Birds");
        System.out.println("    2. Go to Mammal");
        System.out.println("    3. Go to Reptile");
        System.out.println("X. Go back");


        switch (in.next()) {

            case "1":
                //Enviar a menu de Birds

                System.out.println("***  Bird Menu  ***");
                System.out.println("    1. Add new Bird");
                System.out.println("    2. Remove Bird from list");

                break;
            case "2":
                //Enviar e menu de Mammal
                break;
            case "3":
                //Enviar a menu de Reptile
                break;
            default:
                in.nextLine();
                mainMenu();
                break;
        }


    }


}
