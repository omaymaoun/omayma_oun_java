public class Main {

  public static void main(String[] args){
    Animal lion=new Animal("la7em","lion",15,true);
    Zoo myzoo=new Zoo("bilfidar","tunis",10);
//afficher les information de zoo
    myzoo.display_Zoo();
    lion.display_animal();
    System.out.println(myzoo);//il a afficher hashcode de objet dans la memoire
    System.out.println(myzoo.to_string());
    System.out.println(lion.to_String());



}






}
