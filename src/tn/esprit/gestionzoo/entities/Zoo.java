package tn.esprit.gestionzoo.entities;
import exceptions.ZooFullException;
import exceptions.InvalidAgeException;

public class Zoo {
    Aquatique[] aquaticAnimals;
    Animal[] animals;
    private String name;
    private String city;
    final int nbrCages = 2;
    private int nb_animal = 0;
    private int nbr_aquatique = 0;



    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        aquaticAnimals = new Aquatique[10];
        this.name = name;
        this.city = city;


    }

    public void display_Zoo() {
        System.out.println("le nom de zoo:" + getName());
        System.out.println("le nom de city:" + getCity());
        System.out.println("le nombre de cage:" + getNb_animal());
    }

    public String to_string() {

        return "tn.esprit.gestionzoo.entities.Zoo Name:" + name + ", City: " + city + ", Number of Cages: " + nbrCages;
    }




    public void addAnimal(Animal animal) throws ZooFullException {

        if (searchAnimal(animal) != -1) {
            System.out.println("This animal already exists");
            return;
        }
        if (nb_animal >= animals.length) {
            throw new ZooFullException("The Zoo is full");
        }
        animals[nb_animal] = animal;
        nb_animal++;
    }



    public void afficher_animaux() {
        for (int i = 0; i < nb_animal; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            } else {
                System.out.println("Animal à l'index " + i + " est null");
            }
        }


    }

    public int searchAnimal(Animal animal) {

        for (int i = 0; i < nb_animal; i++)
            if (animals[i].getName() == animal.getName()) {
                System.out.println("animal est de indice:" + i);
                return i;

            }

        return -1;


    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Cet animal n'existe pas dans le zoo.");
            return false; // L'animal n'a pas été trouvé
        }
        for (int i = index; i < nb_animal - 1; i++) {
            animals[i] = animals[i + 1]; // Décalage vers la gauche
        }
        animals[nb_animal - 1] = null;
        nb_animal--;
        System.out.println("L'animal a été supprimé avec succès.");
        return true;
    }

    public boolean isZooFull() {
        int nb_max = 5;
        if (nb_animal >= nb_max) {
            System.out.println("Le zoo est plein");
            return true;
        } else {
            return false;
        }
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nb_animal > z2.nb_animal) {
            return z1;
        } else if (z1.nb_animal < z2.nb_animal) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return z1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("le nom est null ou vide!!!!!!");
        } else
            this.name = name;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNb_animal() {
        return nb_animal;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Zoo() {
        aquaticAnimals = new Aquatique[10];  // Tableau de type Aquatic
    }

    public void addAquaticAnimal(Aquatique aquatic) {

        if (nbr_aquatique < 10) {
            aquaticAnimals[nbr_aquatique] = aquatic;
            nbr_aquatique++;
            System.out.println("L'animal aquatique a été ajouté.");


        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");

        }
    }
    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nb_animal; i++) {
            System.out.println(animals[i]);
        }
    }


    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < nbr_aquatique; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxDepth < penguin.swimmingDepth) {
                    maxDepth = penguin.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }





    public void displayNumberOfAquaticsByType() {
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for (int i = 0; i < nbr_aquatique; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Le Zoo " + name + " contient " + nbrDolphins + " dauphins et " + nbrPenguins + " pingouins");
    }











}















