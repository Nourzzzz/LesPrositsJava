package entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;


    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e)) {
            System.out.println("L'employé " + e.getNom() + " est déjà affecté au département "
                    + affectations.get(e).getNom());
        } else {
            affectations.put(e, d);
            System.out.println("Employé " + e.getNom() + " affecté au département " + d.getNom());
        }
    }
    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation enregistrée.");
        } else {
            System.out.println("Liste des affectations (Employé : Département) :");
            for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

}
