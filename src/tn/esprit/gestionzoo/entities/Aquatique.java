package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatique  extends Animal{
    protected  String habitat ;

    public Aquatique() {

    }
    public Aquatique(String family, String Name, int age, boolean isMammal,String habitat) {
        super(family, Name, age, isMammal);
        this.habitat=habitat;;
    }
    public String toString() {  // Correctly naming the method
        return super.toString() + ", habitat: " + habitat;

    }
    public static void swim(){
        System.out.println("This aquatic animal is swimming");
    }
}
