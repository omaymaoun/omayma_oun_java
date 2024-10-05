package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String Name;
    private int age;
   private boolean isMammal;

    Animal[] animals;
    public Animal( String family, String Name, int age, boolean isMammal){
this.family=family;
this.Name=Name;
this.age=age;
this.isMammal=isMammal;
    }
    public void display_animal() {
        System.out.println(" name of famille:" + family);
        System.out.println("name of animal:" + Name);
        System.out.println("age of animal :" + age);
    }

    public String to_String() {

        return "family:" + family + " , animal:" + Name +  ", age:" + age;
    }
//getters et setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0) {
            System.out.println("age est negatif!!!!!!!!!");
        }else{
            this.age=age;
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
       if(name.isEmpty()||name==null)
           System.out.println("le nom est null ou vide!!!!!!");

    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}

