package tn.esprit.gestionzoo.entities;
import exceptions.InvalidAgeException;

public non-sealed class Aquatique  extends Animal{
    protected  String habitat ;

    public Aquatique(String dolphine) {

    }
    public Aquatique(String family, String Name, int age, boolean isMammal,String habitat) throws InvalidAgeException {
        super(family, Name, age, isMammal);
        this.habitat=habitat;
    }

    public String toString() {  

        return super.toString() + ", habitat: " + habitat;

    }
    public static void swim(){
        System.out.println("This aquatic animal is swimming");
    }

    public boolean equals(Object obj) {
        // Vérifie si les objets sont identiques (même référence)
        if (this==obj) return true;

        // Vérifie si l'objet est null
        if (obj == null ||getClass()!=obj.getClass()) return false;
        Aquatique other=(Aquatique)  obj;
        return this.getName().equals(other.getName())&& this.getAge()==other.getAge()&& this.habitat.equals(other.habitat);



    }





}
