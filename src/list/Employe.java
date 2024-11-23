package list;

import java.util.Objects;
public class Employe {
    private int id;
    private String nom;
    private  String prenom;
    private String  nomDepartement;
    private int grade;


    public Employe(){

    }
    public Employe(int id,String nom,String prenom,String nomDepartement,int grade ){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nomDepartement=nomDepartement;
        this.grade=grade;

    }



    public int getId(){
     return id;
    }


    public void setId(int id){
        this.id=id;
    }
   public String getNom(){
        return nom;
   }
   public void setNom(String nom){
        this.nom=nom;
   }
    public String getprenom(){
        return prenom;
    }
    public void setprenom(String prenom){
        this.prenom=prenom;
    }


    public String getNomDepartement(){
        return nomDepartement;
    }
    public void setNomdepartement(String nomDepartement){
        this.nomDepartement=nomDepartement;
    }


    public int getGrade(){
        return grade;
    }
public void setGrade(int grade){

        this.grade=grade;
}

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe=(Employe) obj;
        return id == employe.id && Objects.equals(nom, employe.nom);
          }

       public String toString(){

           return "list.Employe{" + "id=" + id + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", nomDepartement='" + nomDepartement + '\'' + ", grade=" + grade + '}';
       }



}
