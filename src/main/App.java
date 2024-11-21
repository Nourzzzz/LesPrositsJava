package main;
import entities.*;

public class App {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

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
    }
}
