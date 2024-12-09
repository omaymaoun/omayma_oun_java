import java.util.function.Consumer;
import java.util.stream.Stream;

public class Etudient {

private int id;
private String nom;
private int age;


public Etudient(){

}
public Etudient(int id,String nom,int age){
    this.id=id;
    this.nom=nom;
    this.age=age;
}

    public static void forEach(Consumer<Etudient> con) {
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }




    @Override
    public String toString() {
        return "etudient{" + "id=" + id + ", name='" + nom + '\'' + ", age=" + age + '}';
    }

}
