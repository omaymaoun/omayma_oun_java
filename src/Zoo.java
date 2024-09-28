import java.util.Scanner;
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    //compteur
    int nb_animal = 0;


    Zoo(String name, String city) {
        animals = new Animal[25];//creation de tableau
        this.name = name;
        this.city = city;


    }

    public void display_Zoo() {
        System.out.println("le nom de zoo:" + name);
        System.out.println("le nom de city:" + city);
        System.out.println("le nombre de cage:" + nbrCages);
    }

    public String to_string() {

        return "Zoo Name:" + name + ", City: " + city + ", Number of Cages: " + nbrCages;
    }


    public boolean addAnimal(Animal animal) {
        int nb_max = 25;//nombre maximal de animal
        if (isZooFull()) {
            System.out.println("le zoo est plein imossible de ajouter animal !!!!!!");
        }
        if (searchAnimal(animal) != -1) {//verifier animal existe ou non "unicite"
            System.out.println("L'animal  existe déjà !!!!!");
            return false;
        }
        if (nb_animal < nbrCages) {
            animals[nb_animal] = animal;
            nb_animal++;
            return true;
        } else
            return false;

    }

    public void afficher_animaux() {
        for (int i = 0; i < nb_animal; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].to_String()); // Appelle la méthode toString() de Animal
            } else {
                System.out.println("Animal à l'index " + i + " est null");
            }
        }


    }

    public int searchAnimal(Animal animal) {

        for (int i = 0; i < nb_animal; i++) {
            if (animals[i].Name == animal.Name) {
                System.out.println("animal est de indice:" + i);
                return i;

            }

        }

        return -1;


    }


    public boolean removeAnimal(Animal animal) {
        // Cherche l'animal dans le zoo
        int index = searchAnimal(animal);

        if (index == -1) {
            System.out.println("Cet animal n'existe pas dans le zoo.");
            return false; // L'animal n'a pas été trouvé
        }

        // Décale les animaux pour combler le vide
        for (int i = index; i < nb_animal - 1; i++) {
            animals[i] = animals[i + 1]; // Décalage vers la gauche
        }

        animals[nb_animal - 1] = null; // Supprime la dernière référence
        nb_animal--; // Réduit le compteur d'animaux
        System.out.println("L'animal a été supprimé avec succès.");
        return true; // Suppression réussie
    }

    public boolean isZooFull() {
        int nb_max = 25;
        if (nb_animal >= nb_max)
            System.out.println("le zoo est plein");
        return false;

    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nb_animal > z2.nb_animal) {
            return z1;
        } else {
            if (z1.nb_animal < z2.nb_animal) {
                return z2;
            } else {
                System.out.println("les deux zoo ont le meme nombre d animal");
                return z1;
            }
        }


    }

}



