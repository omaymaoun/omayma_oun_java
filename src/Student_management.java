
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Comparator;
import java.util.Collections;




public class Student_management implements Management {

    @Override
    public void displayStudents(List<Etudient> etudients, Consumer<Etudient> con) {
        Etudient.forEach(con);
    }

    public void displayStudentsByFilter(List<Etudient> etudients, Predicate<Etudient> pre, Consumer<Etudient> con) {
        for (Etudient s : etudients) {
            if (pre.test(s))
                con.accept(s);
        }
    }

    public String returnStudentsNames(List<Etudient> etudients, Function<Etudient, String> fun) {

        String names = "";
        for (Etudient E : etudients) {
            names += " " + fun.apply(E);
        }
        return names;
    }


    public Etudient createStudent(Supplier<Etudient> sup) {
        return sup.get();

    }

    @Override
    public List<Etudient> sortStudentsById(List<Etudient> students, Comparator<Etudient> com) {
        Collections.sort(students, com);
        return students;
    }



}