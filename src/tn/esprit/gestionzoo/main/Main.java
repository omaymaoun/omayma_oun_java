
package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

import javax.xml.transform.TransformerFactoryConfigurationError;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Initialisation des zoos
        Animal lion = new Animal("la7em", "lion", 15, true);
        Zoo myzoo = new Zoo("bilfidar","tunis");

        Zoo z1 = new Zoo("zoo1", "Tunis");
        Zoo z2 = new Zoo("Zoo2", "Bizerte");
        myzoo.setName("");
        //myzoo.setName("tn.esprit.gestionzoo.entities.Zoo de tunis");
        //crer des animaux
        Animal a1 = new Animal("la7em", "tigre", 20, false);
        Animal a2 = new Animal("la7em", "giraffe", 21, true);
        Animal a3= new Animal("la7em", "gazelle", 10, true);
        //Animal a4= new Animal("3acheb", "bhim", 10, true);
        //Animal a5 = new Animal("la7em", "tigre", 20, false);

        //ajout des animaux
        System.out.println("ajout de animal numero 1:" +myzoo.addAnimal(a1));
        System.out.println("ajout de animal numero 2:" +myzoo.addAnimal(a2));
        System.out.println("ajout de animal numero 3:" +myzoo.addAnimal(a3));
        //System.out.println("ajout de animal numero 4:" +myzoo.addAnimal(a4));
        //System.out.println("ajout de animal numero 5:" +myzoo.addAnimal(a5));


        // Ajouter des animaux dans le premier zoo (z1)
        z1.addAnimal(new Animal("Lion", "Carnivore", 15, true));
        z1.addAnimal(new Animal("Tigre", "Carnivore", 20, false));
        z1.addAnimal(new Animal("kkkkk", "Carnivore", 15, true));

        // Ajouter des animaux dans le deuxième zoo (z2)
        z2.addAnimal(new Animal("Girafe", "Herbivore", 10, true));
        z2.addAnimal(new Animal("Zèbre", "Herbivore", 12, true));
        z2.addAnimal(new Animal("Éléphant", "Herbivore", 25, true));
        z2.addAnimal(new Animal("Caméléon", "Herbivore", 5, true));

        // Afficher le nombre d'animaux
        System.out.println("Nombre d'animaux dans z1 : " + z1.getNb_animal());
        System.out.println("Nombre d'animaux dans z2 : " + z2.getNb_animal());

        // Comparer les deux zoos pour savoir lequel a le plus d'animaux
        Zoo zooPlusPeuple = Zoo.comparerZoo(z1, z2);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooPlusPeuple.getName());


        Aquatique aquatic=new Aquatique("fish","bouri",5,false,"20");
        Dolphin dolphin=new Dolphin("Delphinidae","ocra",10,true,"14");
        Penguin penguin=new Penguin("Spheniscidae","Aqua",5,false,100,"18");
        Terrestre terrestre=new Terrestre("carnivore","vache",7,false);

        System.out.println(aquatic);
        System.out.println(terrestre);
        System.out.println(dolphin);
        System.out.println(penguin);


        Aquatique.swim();
        Dolphin.swim();
        Penguin.swim();


    }


}





