package entities;
import java.util.Objects;

public class Departement {
    private int id;
    private String nom;
    private int nombreEmployes;


    public Departement() {
    }


    public Departement(int id, String nom, int nombreEmployes) {
        this.id = id;
        this.nom = nom;
        this.nombreEmployes = nombreEmployes;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }



    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Departement D) {
            return this.id == D.id && this.nom.equals(D.nom);
        }
        return false;

    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + nom.hashCode();
        return result;

    }

    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
}