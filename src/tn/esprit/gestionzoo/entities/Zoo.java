package tn.esprit.gestionzoo.entities;


public class Zoo {
    Animal[] animals;
    private String name;
    private String city;
    final int nbrCages = 25;
    //compteur
    private int nb_animal = 0;


    public Zoo(String name, String city) {
        animals = new Animal[25];//creation de tableau
        this.name = name;
        this.city = city;


    }

    public void display_Zoo() {
        System.out.println("le nom de zoo:" + getName());
        System.out.println("le nom de city:" +getCity());
        System.out.println("le nombre de cage:" + getNb_animal());
    }

    public String to_string() {

        return "tn.esprit.gestionzoo.entities.Zoo Name:" + name + ", City: " + city + ", Number of Cages: " + nbrCages;
    }


    public boolean addAnimal(Animal animal) {
        int nb_max = 5; // Nombre maximal d'animaux
        // Vérifier si le zoo est plein
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter un animal !");
            return false;  // Retourner false si le zoo est plein
        }

        // Vérifier si l'animal existe déjà
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal existe déjà !");
            return false;  // Retourner false si l'animal existe déjà
        }

        // Ajouter l'animal si le zoo n'est pas plein et l'animal n'existe pas déjà
        if (nb_animal < nb_max) {
            animals[nb_animal] = animal; // Ajouter l'animal dans le tableau
            nb_animal++; // Incrémenter le nombre d'animaux
            return true; // Retourner true si l'animal a été ajouté avec succès
        }

        return false; // Retourner false en cas d'erreur imprévue
    }



    public void afficher_animaux() {
        for (int i = 0; i < nb_animal; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString()); // Appelle la méthode toString() de Animal
            } else {
                System.out.println("Animal à l'index " + i + " est null");
            }
        }


    }

    public int searchAnimal(Animal animal) {

        for (int i = 0; i < nb_animal; i++) {
            if (animals[i].getName() == animal.getName()) {
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
        int nb_max = 5;  // Capacité maximale du zoo
        if (nb_animal >= nb_max) {  // Si le nombre d'animaux atteint ou dépasse la capacité
            System.out.println("Le zoo est plein");
            return true;  // Le zoo est plein
        } else {
            return false;  // Le zoo n'est pas encore plein
        }
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nb_animal > z2.nb_animal) {
            return z1;
        } else if (z1.nb_animal < z2.nb_animal) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return z1; // Peut retourner l'un ou l'autre, car ils sont égaux
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()){
            System.out.println("le nom est null ou vide!!!!!!");
    }else
        this.name=name;

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

}




