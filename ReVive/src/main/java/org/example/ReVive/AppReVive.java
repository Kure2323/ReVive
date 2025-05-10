package org.example.ReVive;

import org.example.Main;
import org.example.ReVive.Specie.Bird;
import org.example.ReVive.Specie.Mammal;
import org.example.ReVive.Specie.Reptile;
import org.example.ReVive.Specie.Specie;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppReVive {

    static Proyect_Ecosystem proyecto = new Proyect_Ecosystem("Dessert", "FreeDessert", "Africa");
    static Organization organization = new Organization("EEOA", 646578710);

    //Lists of all classes needed
    static List<User> userList = new ArrayList<>();
    static List<Bird> birdList = new ArrayList<>();
    static List<Mammal> mammalList = new ArrayList<>();
    static List<Reptile> reptileList = new ArrayList<>();


    static User user;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        organization.agregarProyecto(proyecto);
        userMenu();
        

    }

    public static void userMenu() {

        System.out.println();
        System.out.println("***  WELCOME  ***");
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

                if (userList.isEmpty()) {
                    System.out.println();
                    System.out.println("There are no Users");
                    System.out.println();
                    userMenu();
                }

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
            default:
                in.nextLine();
                userMenu();
        }

    }

    public static void mainMenu() {

        System.out.println();
        System.out.println("***  Main Menu  ***");
        System.out.println("    1. Go to Species");
        System.out.println("    2. Go to Donations");
        System.out.println("    3. Go to Organizations");
        System.out.println("    4. Go to Proyects");
        System.out.println("    5. User menu");
        System.out.println();

        try{
            switch (in.nextInt()) {
                case 1:
                    //Enviar a menú de Species

                    specieMenu();


                    break;
                case 2:
                    //Enviar a Donations

                    System.out.println();
                    System.out.println("***  Donations  ***");
                    System.out.println("    1. Make a donation");
                    System.out.println("    2. ");




                    break;
                case 3:
                    //Enviar a Organizations
                    break;
                case 4:
                    //Enviar a Proyects
                    break;
                case 5:
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

                birdsMenu();

                break;
            case "2":
                //Enviar e menu de Mammal

                mammalMenu();

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

    private static void mammalMenu() {
        System.out.println("***  Mammal Menu  ***");
        System.out.println("    1. Add new Mammal");
        System.out.println("    2. Remove Mammal from list");
        System.out.println("    3. Show all Mammals");
        System.out.println("X. Go back");

        switch (in.next()) {

            case "1":

                boolean dangerSpecies = false;
                boolean marsupial = false;

                System.out.println("Common Name:");
                String commonName = in.next();
                System.out.println("Scientific Name");
                String scientName = in.next();
                System.out.println("Is it dangerous? [Y/N]");
                if (in.next().equalsIgnoreCase("y")) {
                    dangerSpecies = true;
                }
                System.out.println("Location");
                String location = in.next();
                System.out.println("Hair");
                String hair = in.next();
                System.out.println("Is it marsupial? [Y/N]");
                if (in.next().equalsIgnoreCase("y")) {
                    marsupial = true;
                }

                mammalList.add(new Mammal(Integer.toString(Specie.generateId()),commonName, scientName,
                        dangerSpecies,location,hair,marsupial));
                System.out.println(commonName + " created and added to the Mammal List.");
                in.nextLine();
                mammalMenu();
                break;

            case "2":

                System.out.println("Enter the Scientific name of the mammal you want to remove:");
                String s = in.next();

                for (Mammal m: mammalList) {
                    if (m.getScientName().equalsIgnoreCase(s)) {
                        mammalList.remove(m);
                        System.out.println(m.getScientName() + " has been removed.");
                        System.out.println();
                        break;
                    }
                }

                in.nextLine();
                mammalMenu();
                break;

            case "3":

                for (Mammal m: mammalList) {
                    System.out.println();
                    System.out.println(m);
                    System.out.println("Hair= " + m.getHair());
                    System.out.println("Is Marsupial= " + m.isMarsupial());
                    System.out.println();
                }

                in.nextLine();
                mammalMenu();
                break;

            default:
                in.nextLine();
                specieMenu();
                break;


        }
    }

    private static void birdsMenu() {
        System.out.println("***  Bird Menu  ***");
        System.out.println("    1. Add new Bird");
        System.out.println("    2. Remove Bird from list");
        System.out.println("    3. Show all Birds");
        System.out.println("X. Go back");

        switch (in.next()) {
            case "1":

                boolean dangerSpecies = false;

                System.out.println("Common Name:");
                String commonName = in.next();
                System.out.println("Scientific Name");
                String scientName = in.next();
                System.out.println("Is it dangerous? [Y/N]");
                if (in.next().equalsIgnoreCase("y")) {
                    dangerSpecies = true;
                }
                System.out.println("Location");
                String location = in.next();
                System.out.println("Type Break");
                String typeBreak = in.next();
                System.out.println("Migrate Season");
                String migrateSeason = in.next();

                Bird bird = new Bird(Integer.toString(Specie.generateId()) ,commonName, scientName, dangerSpecies, location, typeBreak, migrateSeason);

                birdList.add(bird);
                Specie.specieList.add(bird);

                System.out.println(commonName + " created and added to the Bird List.");
                in.nextLine();
                birdsMenu();
                break;

            case "2":

                System.out.println("Enter the Scientific name of the bird you want to remove:");
                String s = in.next();

                for (Bird b: birdList) {
                    if (b.getScientName().equalsIgnoreCase(s)) {
                        birdList.remove(b);
                        System.out.println(b.getScientName() + " has been removed.");
                        System.out.println();
                        break;
                    }
                }

                in.nextLine();
                birdsMenu();
                break;

            case "3":

                for (Bird b: birdList) {
                    System.out.println();
                    System.out.println(b);
                    System.out.println("Type Break= " + b.getTypeBreak());
                    System.out.println("Migrate Season= " + b.getMigrateSeason());
                    System.out.println();
                }

                in.nextLine();
                birdsMenu();
                break;

            default:
                in.nextLine();
                specieMenu();
                break;

        }
    }


}
