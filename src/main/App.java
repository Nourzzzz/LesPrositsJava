package main;
import entities.*;

public class App {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
/*
        // Ajouter des employés
        societe.ajouterEmploye(new Employe(3, "Ali", "Mohamed", "IT", 2));
        societe.ajouterEmploye(new Employe(1, "Ahmed", "Salah", "Finance", 1));
        societe.ajouterEmploye(new Employe(2, "Leila", "Khaled", "IT", 3));

        // Afficher avant tri
        System.out.println("Avant tri :");
        societe.displayEmploye();

        // Trier par ID
        societe.trierEmployeParId();
        System.out.println("Après tri par ID :");
        societe.displayEmploye();

        // Trier par Département et Grade
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("Après tri par Département et Grade :");
        societe.displayEmploye();
        */
        AffectationHashMap gestionAffectations = new AffectationHashMap();
        Employe e1 = new Employe(1, "Ali", "Mohamed", "IT", 2);
        Employe e2 = new Employe(2, "Ahmed", "Salah", "Finance", 1);
        Employe e3 = new Employe(3, "Leila", "Khaled", "RH", 3);
        Departement d1 = new Departement(101, "IT", 10);
        Departement d2 = new Departement(102, "Finance", 5);
        Departement d3 = new Departement(103, "RH", 8);
        gestionAffectations.ajouterEmployeDepartement(e1, d1);
        gestionAffectations.ajouterEmployeDepartement(e2, d2);
        gestionAffectations.ajouterEmployeDepartement(e3, d3);
        gestionAffectations.ajouterEmployeDepartement(e1, d2);
        gestionAffectations.supprimerEmploye(e2);
        gestionAffectations.afficherEmployesEtDepartements();
        gestionAffectations.supprimerEmployeEtDepartement(e3, d3);
        gestionAffectations.afficherEmployesEtDepartements();
        gestionAffectations.afficherEmployes();
        gestionAffectations.afficherDepartements();

    }
}
