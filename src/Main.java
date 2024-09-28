public class Main {

  public static void main(String[] args) {
    Animal lion = new Animal("la7em", "lion", 15, true);
    Zoo myzoo = new Zoo("bilfidar","tunis");
    Zoo z1=new Zoo("kkkkk","tunis");
    Zoo z2=new Zoo("lllllll","bizerte");

//afficher les information de zoo
    myzoo.display_Zoo();
    //lion.display_animal();
    System.out.println(myzoo);//il a afficher hashcode de objet dans la memoire
    System.out.println(myzoo.to_string());
    System.out.println(lion.to_String());
//crer des animaux
    Animal a1 = new Animal("la7em", "tigre", 20, false);
    Animal a2 = new Animal("la7em", "giraffe", 21, true);
    Animal a3= new Animal("la7em", "gazelle", 10, true);
    Animal a4= new Animal("3acheb", "bhim", 10, true);
    Animal a5 = new Animal("la7em", "tigre", 20, false);
//ajouter  et afficher des animaux
    System.out.println("ajout de animal numero 1:" +myzoo.addAnimal(a1));
    System.out.println("ajout de animal numero 2:" +myzoo.addAnimal(a2));
    System.out.println("ajout de animal numero 3:" +myzoo.addAnimal(a3));
   System.out.println("ajout de animal numero 4:" +myzoo.addAnimal(a4));
    //System.out.println("ajout de animal numero 5:" +myzoo.addAnimal(a5));


    //afficher animal cherché
   int index= myzoo.searchAnimal(a2);
   myzoo.addAnimal(a4);//deja animal existe dans le tableau
   myzoo.afficher_animaux();
   myzoo.removeAnimal(a2);
   myzoo.afficher_animaux();//supprimer animal
      // myzoo.comparerZoo(z1,z2);


      // Ajouter des animaux dans le premier zoo (zoo1)
      z1.addAnimal(new Animal("Lion", "Carnivore", 15, true));
      z1.addAnimal(new Animal("Tigre", "Carnivore", 20, false));

      // Ajouter des animaux dans le deuxième zoo (zoo2)
      z2.addAnimal(new Animal("Girafe", "Herbivore", 10, true));
      z2.addAnimal(new Animal("Zèbre", "Herbivore", 12, true));
      z2.addAnimal(new Animal("Éléphant", "Herbivore", 25, true));



      // Comparer les deux zoos pour savoir lequel a le plus d'animaux
      Zoo zooPlusPeuple = Zoo.comparerZoo(z1, z2);

  }



  }






