package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatique  extends Animal{
    protected  String habitat ;

    public Aquatique(String dolphine) {

    }
    public Aquatique(String family, String Name, int age, boolean isMammal,String habitat) {
        super(family, Name, age, isMammal);
        this.habitat=habitat;;
    }
<<<<<<< HEAD

   
    public String toString() {
=======
    public String toString() {  
>>>>>>> d65d74fd929712c84d10b5e73b2bc5366a5a9bc6
        return super.toString() + ", habitat: " + habitat;

    }
    public static void swim(){
        System.out.println("This aquatic animal is swimming");
    }



}
