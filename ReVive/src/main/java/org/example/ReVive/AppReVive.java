package org.example.ReVive;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppReVive {

    static Proyect_Ecosystem proyecto = new Proyect_Ecosystem("Dessert", "FreeDessert", "Africa");
    static Organization organization = new Organization("EEOA", 646578710);
    static List<User> userList = new ArrayList<>();
    static User user;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        organization.agregarProyecto(proyecto);
        userMenu();
        

    }

    public static void userMenu() {

        System.out.println();
        System.out.println("    1. Register");
        System.out.println("    2. Login");
        System.out.println();

        switch (in.next()) {
            case "1":

                System.out.println("***  Sign in  ***");
                System.out.println("Introduce your username, it must be unique");
                String username = in.next();
                System.out.println("Introduce your password " + username);
                String password = in.next();

                User aux = new User(username, password);

                //Checkea si existe ya el username entre los usuarios existentes
                for (User u: userList) {
                    if (u.equals(aux,0)) {
                        System.out.println("This username already exists.");
                        System.out.println();
                        in.nextLine();
                        userMenu();
                    }
                }

                user = aux;
                userList.add(user);

                mainMenu();

                break;
            case "2":
                System.out.println();
                System.out.println("***  Login  ***");
                System.out.println("Type your username:");
                String name = in.next();
                System.out.println("Type your password:");
                String password1 = in.next();

                User extra = new User(name, password1);

                for (User u: userList) {
                    if (u.equals(extra, 1)) {
                        System.out.println("Wellcome " + name + "!!");
                        user = u;
                        mainMenu();
                    }
                }

                System.out.println("Login error");
                in.nextLine();
                userMenu();

                break;
        }

    }

    public static void mainMenu() {

        System.out.println();
        System.out.println("***  Main Menu  ***");
        System.out.println("    1. Go to Species");
        System.out.println("    2. Go to Donations");
        System.out.println("    3. Go to Organizations");
        System.out.println("    4. Go to Proyects");
        System.out.println("    5. Edite your User");
        System.out.println("    6. User menu");
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
                case 6:
                    //Iniciar sesión y registrar
                    userMenu();
                    break;

            }
        } catch (InputMismatchException e) {
            in.nextLine();
            mainMenu();
        }

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
