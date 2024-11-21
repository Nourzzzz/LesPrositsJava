package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }


    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }


    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }


    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }


    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }


    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }


    public void trierEmployeParId() {
        Collections.sort(employes, new ComparateurParId());
    }


    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, new ComparateurParNomDepartementEtGrade());
    }
}