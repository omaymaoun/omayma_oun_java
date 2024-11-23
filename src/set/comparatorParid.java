package set;

import java.util.Comparator;

   public class comparatorParid implements Comparator<Departement>{
       public int compare(Departement o1, Departement o2) {
           return o1.getId() - o2.getId();
       }
   }




