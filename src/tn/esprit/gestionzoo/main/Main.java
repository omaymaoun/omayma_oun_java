
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import exceptions.ZooFullException;
import exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.entities.Food;
public class Main {
    public static void main(String[] args) throws ZooFullException, InvalidAgeException {
        // Initialisation des zoos
        Animal lion = null;
        try {
            lion = new Animal("la7em", "lion", 50, true);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
        Zoo myzoo = new Zoo("bilfidar", "tunis");

        Zoo z1 = new Zoo("zoo1", "Tunis");
        Zoo z2 = new Zoo("Zoo2", "Bizerte");

        // Créer des animaux
        Animal a1 = null;
        try {
            a1 = new Animal("la7em", "tigre", 50, false);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
        Animal a2 = null;
        try {
            a2 = new Animal("la7em", "giraffe", 21, true);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
        Animal a3 = null;
        try {
            a3 = new Animal("la7em", "gazelle", 10, true);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }

        // Ajout des animaux
        try {
            myzoo.addAnimal(a1);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myzoo.getName() + " contient " + myzoo.getNb_animal() + " animaux");
        }
        try {
            myzoo.addAnimal(a2);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myzoo.getName() + " contient " + myzoo.getNb_animal() + " animaux");
        }

        try {
            myzoo.addAnimal(a3);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myzoo.getName() + " contient " + myzoo.getNb_animal() + " animaux");
        }
        try {
            lion.setAge(8);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        // Afficher le nombre d'animaux
        System.out.println("Nombre d'animaux dans z1 : " + z1.getNb_animal());
        System.out.println("Nombre d'animaux dans z2 : " + z2.getNb_animal());

        // Comparer les deux zoos pour savoir lequel a le plus d'animaux
        Zoo zooPlusPeuple = Zoo.comparerZoo(z1, z2);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooPlusPeuple.getName());


        Aquatique aquatic = null;

        try {
            aquatic = new Aquatique("fish", "bouri", 10, false, "20");
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);

        }
        Dolphin dolphin = null;
        try {
            dolphin = new Dolphin("Delphinidae", "ocra", 10, true, "14");
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
        Penguin penguin = null;
        try {
            penguin = new Penguin("Spheniscidae", "Aqua", 5, false, 50.2f, "18");
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
        Penguin penguin2 = null;
        try {
            penguin2 = new Penguin("7ott", "bouri", 10, false, 20.4f, "20");
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }

        Terrestre terrestre = null;
        try {
            terrestre = new Terrestre("carnivore", "vache", 7, false);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }





        System.out.println(aquatic);
        System.out.println(terrestre);
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(penguin2);


        Aquatique.swim();
        Dolphin.swim();
        Penguin.swim();
        terrestre.eatPlant(Food.PLANT);


        try {
            myzoo.addAnimal(dolphin);
        } catch (ZooFullException e) {
            throw new RuntimeException(e);
        }
        myzoo.addAquaticAnimal(penguin);
        myzoo.addAquaticAnimal(penguin2);
        myzoo.addAquaticAnimal(dolphin);

        myzoo.displayAnimals();

        System.out.println("La profondeur maximale des pingouins est : " + myzoo.maxPenguinSwimmingDepth() + " mètres."); // Appel sur l'instance
        myzoo.displayNumberOfAquaticsByType();


        System.out.println("**************prosit8**********");

        penguin = new Penguin("Felidae", "Tiger", 5, false, 50.2f, "18");
        penguin.eatMeat(Food.MEAT);


        aquatic = new Aquatique("Canidae", "Wolf", 16, false, "20");
        aquatic.eatMeat(Food.MEAT);


        terrestre = new Terrestre("Phascolarctidae", "Koala", 7, false);
        terrestre.eatPlant(Food.PLANT);


        terrestre = new Terrestre("Suidae", "pork", 7, false);
        terrestre.eatPlantAndMeet(Food.BOTH);







    }






}




