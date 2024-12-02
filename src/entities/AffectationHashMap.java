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
    public void supprimerEmploye(Employe e) {
        if (affectations.containsKey(e)) {
            affectations.remove(e);
            System.out.println("L'employé " + e.getNom() + " a été supprimé.");
        } else {
            System.out.println("L'employé " + e.getNom() + " n'existe pas.");
        }
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("L'employé " + e.getNom() + " affecté au département " + d.getNom() + " a été supprimé.");
        } else {
            System.out.println("Mahouch mawjoud.");
        }
    }
    public void afficherEmployes() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun employé enregistré.");
        } else {
            System.out.println("Liste des employés :");
            for (Employe e : affectations.keySet()) {
                System.out.println(e);
            }
        }
    }
    public void afficherDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun département enregistré.");
        } else {
            System.out.println("Liste des départements :");
            for (Departement d : affectations.values()) {
                System.out.println(d);
            }
        }
    }
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

}
