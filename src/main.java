
import list.Employe;
import list.SocieteArrayList;
import set.Departement;
import set.DepartementHashSet;

public class main {

    public static void main(String[] args) {
   SocieteArrayList list=new  SocieteArrayList();
    DepartementHashSet list_departement=new DepartementHashSet();

   Employe emp1=new Employe(1,"omayma","oun","IT",5);
   Employe emp2=new Employe(5, "Durand", "Claire", "HR",3 );
   Employe emp3 = new Employe(3, "Martin", "Paul", "Finance", 2);
   Employe emp4 = new Employe(4, "djoko", "Sophie", "IT", 4);

   Departement dep1=new Departement(10,"RH",30);
   Departement dep2=new Departement(50,"finance",50);
   Departement dep3=new Departement(30,"informatique",20);



   list_departement.ajouterDepartement(dep1);
   list_departement.ajouterDepartement(dep2);
   list_departement.ajouterDepartement(dep3);



     list.ajouterEmploye(emp1);
     list.ajouterEmploye(emp2);
     list.ajouterEmploye(emp3);
     list.ajouterEmploye(emp4);

      System.out.println("*****list des employes************");
     list.displayEmploye();

        System.out.println("*****chercher employe par nom************");
        String employe_cherche="omayma";
         boolean trouve= list.rechercherEmploye(employe_cherche);
        System.out.println("\nRecherche de l'employé '" + employe_cherche + "': " + (trouve ? "Trouvé" : "Non trouve"));

        System.out.println("*****chercher employe par objet************");
        boolean trouve_object=list.rechercherEmploye(emp1);
        System.out.println("\nRecherche de l'employé '" +emp1+ "': "+ (trouve_object? "Trouvé" : "Non trouve"));


        System.out.println("*****trie employe par id");
        list.trierEmployeParId();
      list.displayEmploye();


      System.out.println("********trie employe par nom departement et grade");
      list.trierEmployeParNomDépartementEtGrade();
      list.displayEmploye();

        System.out.println("********supprimer employé*********");
        list.supprimerEmploye(emp3);
        list.displayEmploye();

        System.out.println("/////////////////////////Mneu des departements/////////////////////////////////////////");

       System.out.println("***********afficher departement**************");
       list_departement.displayDepartement();

        System.out.println("***********rechercher departement par nom**************");
        String depart_cherche="RH";
        boolean trouves= list_departement.rechercherDepartement(depart_cherche);
        System.out.println("\nRecherche de departement '" + depart_cherche + "': " + (trouves ? "Trouvé" : "Non trouve"));


        System.out.println("***********rechercher departement par objet**************");

        boolean trouves1=list_departement.rechercherDepartement(dep1);
        System.out.println("\nRecherche de departement '" + dep1 + "': " + (trouves1 ? "Trouvé" : "Non trouve"));

        System.out.println("***********trie set.Departement**************");

        list_departement.trierDepartementById();
        list_departement.displayDepartement();













    }

}
