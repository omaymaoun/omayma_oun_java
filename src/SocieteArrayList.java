
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



 public  class SocieteArrayList implements IGestion <Employe>{
     private List<Employe> listeEmployes = new ArrayList<>();

     @Override
     public void ajouterEmploye(Employe employe) {
      listeEmployes.add(employe);
     }

     @Override
     public boolean rechercherEmploye(String nom) {
         return listeEmployes.stream().anyMatch(e -> e.getNom().equalsIgnoreCase(nom));
     }

     @Override
     public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
     }

     @Override
     public void supprimerEmploye(Employe employe) {
          listeEmployes.remove(employe);
     }


     @Override
     public void displayEmploye() {
         listeEmployes.forEach(System.out::println);
     }

     @Override
     public void trierEmployeParId() {
         listeEmployes.sort(Comparator.comparingInt(Employe::getId));
     }

     @Override
     public void trierEmployeParNomDépartementEtGrade() {
         listeEmployes.sort(Comparator.comparing(Employe::getNomDepartement).thenComparingInt(Employe::getId).thenComparing(Employe::getNom));
     }

 }




