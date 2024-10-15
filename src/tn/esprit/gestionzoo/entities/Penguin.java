package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatique {
protected float swimmingDepth;
public Penguin(String family, String Name, int age, boolean isMammal,float swimmingDepth,String habitat){
    super(family,Name,age,isMammal,habitat);
    this.swimmingDepth=swimmingDepth;
}
    public String to_String() {

       return super.toString()+",swimmingDepth +" +swimmingDepth;
    }



}
