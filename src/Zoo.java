public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    Zoo(String name, String city, int nbrCages) {
        animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

    }

    public void display_Zoo() {
        System.out.println("le nom de zoo:" + name);
        System.out.println("le nom de city:" + city);
        System.out.println("le nombre de cage:" + nbrCages);
    }

    public String to_string() {

        return "Zoo Name:" + name + ", City: " + city + ", Number of Cages: " + nbrCages ;
    }

}
