import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Comparator;


public interface Management {

    void displayStudents(List<Etudient> etudients, Consumer<Etudient> con);

    void displayStudentsByFilter(List<Etudient> etudients, Predicate<Etudient> pre, Consumer<Etudient> con);

    String returnStudentsNames(List<Etudient> etudients, Function<Etudient, String> fun);

    Etudient createStudent(Supplier<Etudient> sup);

    List<Etudient> sortStudentsById(List<Etudient> etudients, Comparator<Etudient> com);


}
