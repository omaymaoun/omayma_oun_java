package tn.esprit.gestionzoo.entities;
import exceptions.InvalidAgeException;
import interfaces.omnivore;

public non-sealed class Terrestre extends Animal implements omnivore<Food>{
protected  int nbrLegs;

    public Terrestre(String family, String Name, int age, boolean isMammal) throws InvalidAgeException {
        super(family, Name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }
    public String to_String() {

        return super.toString()+",nbrLegs +" +nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("The Terrestrial " + getName() + " is eating " + meat);

    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("The Terrestrial " + getName() + " is eating " + plant);
    }

    public void eatPlantAndMeet( Food food){
        System.out.println("The Terrestrial " + getName() + " is eating " + food + " plants and meat");
    }

}
