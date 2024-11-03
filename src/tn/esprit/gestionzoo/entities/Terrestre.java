package tn.esprit.gestionzoo.entities;

import exceptions.InvalidAgeException;

public non-sealed class Terrestre extends Animal{
protected  int nbrLegs;

    public Terrestre(String family, String Name, int age, boolean isMammal) throws InvalidAgeException {
        super(family, Name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }
    public String to_String() {

        return super.toString()+",nbrLegs +" +nbrLegs;
    }

}
