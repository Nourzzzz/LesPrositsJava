package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected Animal[] animals;
    protected String name;
    protected String city;
    protected final int NBR_CAGES;
    protected int nbrAnimals=0;

    public Zoo(String name, String city) {
        this.NBR_CAGES = 25;
        this.animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }
    public String toString() {
        return String.format("Name: %s, City: %s, Nombre de cages: %d", this.name, this.city, this.NBR_CAGES);
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            System.out.println("veuillez saisir un nom");
        }
        else {
            this.name = name;
        }

    }
    public String getName() {
        return name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getCity() {
        return city;
    }

    public int getNBR_CAGES() {
        return NBR_CAGES;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public boolean addAnimal(Animal animal) {
        if(searchAnimal(animal.name) == -1 && !isZooFull() ) {
            this.animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }


    public void ajouterAnimal(Animal animal, int cageNumber) {
        if (cageNumber >= 0 && cageNumber < this.NBR_CAGES) {
            this.animals[cageNumber] = animal;
        } else {
            System.out.println("Numéro de cage invalide");
        }

    }

    public void displayZoo(Zoo a) {
        System.out.printf("Name: " + a.name);
        System.out.printf("City: " + a.city);
        System.out.printf("Nombre de cage: " + a.NBR_CAGES);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }

    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);
        this.animals[index] = null;
        return true;
    }

    public boolean isZooFull()
    {
        return nbrAnimals == NBR_CAGES;

    }

    public Zoo comparerZoo(Zoo a, Zoo b) {
        if(a.nbrAnimals>b.nbrAnimals)
        {
            return a;
        }
        return b;
    }





}
