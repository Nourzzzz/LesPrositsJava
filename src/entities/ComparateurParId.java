package entities;
import java.util.Comparator;
public class ComparateurParId implements Comparator<Employe> {

    public int compare(Employe e1, Employe e2) {
        return Integer.compare(e1.getId(), e2.getId());
    }
}