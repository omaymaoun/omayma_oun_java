
import java.util.*;

public class main {

    public static void main(String[] args) {
   SocieteArrayList list=new  SocieteArrayList();


   Employe emp1=new Employe(1,"omayma","oun","IT",5);
   Employe emp2=new Employe(5, "Durand", "Claire", "HR",3 );
   Employe emp3 = new Employe(3, "Martin", "Paul", "Finance", 2);
   Employe emp4 = new Employe(4, "djoko", "Sophie", "IT", 4);

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









    }

}
