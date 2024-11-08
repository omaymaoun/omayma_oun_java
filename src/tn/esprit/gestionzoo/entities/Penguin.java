package tn.esprit.gestionzoo.entities;

import exceptions.InvalidAgeException;

import javax.print.DocFlavor;

public class Penguin extends Aquatique {
protected float swimmingDepth;
public Penguin(String family, String Name, int age, boolean isMammal,float swimmingDepth,String habitat) throws InvalidAgeException {
    super(family,Name,age,isMammal,habitat);
    this.swimmingDepth=swimmingDepth;
}


    public String to_String() {

       return super.toString()+",swimmingDepth +" +swimmingDepth;
    }



}
