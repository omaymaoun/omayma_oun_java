import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class main {

    public static void main(String[] args) {

        List<Etudient> students = new ArrayList<>();
        students.add(new Etudient(1, "omayma", 22));
        students.add(new Etudient(2, "imen", 20));
        students.add(new Etudient(3, "mario", 24));


        Student_management st = new Student_management();

        //lambda
        Consumer<Etudient> con = s -> System.out.println(s);
        st.displayStudents(students, con);
        //reference method
        st.displayStudents(students, System.out::println);

        //lambda
        Predicate<Etudient> pre = t -> t.getAge() > 22;
        st.displayStudentsByFilter(students, pre, con);

        //lambda
        Function<Etudient, String> fun = e -> e.getNom();
        String names = st.returnStudentsNames(students, fun);
        System.out.println(names);
        //reference method
        String names1 = st.returnStudentsNames(students, Etudient::getNom);
        System.out.println(names1);

        //lambda (create empty student object)
        Supplier<Etudient> sup = () -> new Etudient();
        Etudient student = st.createStudent(sup);
        System.out.println(student);
        //lambda (create parametrized student object)
        Supplier<Etudient> sup1 = () -> new Etudient(11, "bruno",20);
        Etudient student1 = st.createStudent(sup);
        System.out.println(student1);

        //reference method (create empty student object)
        Supplier<Etudient> sup2 = Etudient::new;
        Etudient student2 = sup2.get();
        System.out.println(student2);

        /*//reference method (create parametrized student object)
        TripleFunction<Integer, Integer, String, Etudient> tf = Etudient::new;
        Etudient student3 = tf.convert(11, 23, "Amy");
        System.out.println(student3);


        //lambda
        Comparator<Etudient> com = (a, b) -> a.getId() - b.getId();
        List<Etudient> students1 = st.sortStudentsById(students, com);
        System.out.println(students1);

         */

    }
}