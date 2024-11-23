package set;

import set.Departement;
import set.comparatorParid;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet <Departement> list_departement =new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        list_departement.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Departement> it = list_departement.iterator();
       while (it.hasNext()) {
          Departement d = it.next();
           if (d.getNom().equals(nom))
               return true;
       }

        for (Departement d : list_departement) {
            if (d.getNom().equals(nom))
                return true;
        }

        return false;
    }


    @Override
    public boolean rechercherDepartement(Departement departement) {
        return list_departement.contains(departement);
    }


    @Override
    public void displayDepartement() {
        list_departement.forEach(System.out::println);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        TreeSet<Departement> tree = new TreeSet<>(new comparatorParid());
        tree.addAll(list_departement);
        return  tree;

    }

    @Override
    public void supprimerDepartement(Departement departement) {
        list_departement.remove(departement);
    }
}
