package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.ZooFullException;

public class Zoo {
    protected Animal[] animals;
    protected String name;
    protected String city;
    protected final int NBR_CAGES;
    protected int nbrAnimals=0;
    protected Aquatic[] aquaticAnimals;

    public Zoo(String name, String city) {
        this.NBR_CAGES = 3;
        this.animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
        this.aquaticAnimals = new Aquatic[10];
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

    public void addAnimal(Animal animal) throws ZooFullException {
        if (nbrAnimals >= NBR_CAGES) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter l'animal : " + animal.getName());
        }
        if (searchAnimal(animal.name) == -1) {
            this.animals[nbrAnimals] = animal;
            nbrAnimals++;
            System.out.println("Animal ajouté : " + animal);
        } else {
            System.out.println("L'animal existe déjà dans le zoo.");
        }
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
        for (Aquatic animal : aquaticAnimals) {
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

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAnimals] = aquatic;  // Ajoute l'animal dans le tableau
            nbrAnimals++;
        } else {
            System.out.println("The zoo is full! Can't add more aquatic animals.");
        }
    }

    public float maxPenguinSwimmingDepth()
    {
        float max=0;
        for (Aquatic animal : aquaticAnimals)
        {
            if(animal instanceof Penguin)
            {
                if(max<((Penguin) animal).swimmingDepth)
                {
                    max=((Penguin)  animal).swimmingDepth;
                }
            }

        }
        return max;


    }

    public void displayNumberOfAquaticsByTypes()
    {
        int Pen = 0;
        int Dolp= 0;

        for (Aquatic animal : aquaticAnimals)
        {
            if(animal instanceof Penguin)
            {
                Pen=Pen+1;
            }
            else if(animal instanceof Dolphin)
            {
                Dolp=Dolp+1;
            }

        }
        System.out.println("Le nombre de penguin est " + Pen);
        System.out.println("Le nombre de doplhin est " + Dolp);



    }





}
