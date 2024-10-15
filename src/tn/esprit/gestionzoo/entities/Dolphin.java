package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatique {
    protected float swimmingSpeed;
    public Dolphin(String family, String Name, int age, boolean isMammal,String habitat){
        super(family,Name,age,isMammal,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    public String to_String() {

        return super.toString()+",swimmingSpeed +" +swimmingSpeed;
    }
public static void swim(){
        System.out.println("This dolphin is swimming");
}

}
