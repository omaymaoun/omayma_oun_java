public class Animal {
    String family;
    String Name;
    int age;
    boolean isMammal;

    Animal[] animals;
    Animal( String family, String Name, int age, boolean isMammal){
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




}

