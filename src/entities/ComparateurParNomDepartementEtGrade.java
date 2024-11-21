package entities;

import java.util.Comparator;

public class ComparateurParNomDepartementEtGrade implements Comparator<Employe> {

    public int compare(Employe e1, Employe e2) {
        int comparaisonDepartement = e1.getNomDepartement().compareToIgnoreCase(e2.getNomDepartement());
        if (comparaisonDepartement != 0) {
            return comparaisonDepartement;
        }
        return Integer.compare(e1.getGrade(), e2.getGrade());
    }
}