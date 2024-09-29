public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int NBR_CAGES;
    int nbrAnimals=0;

    public Zoo(String name, String city) {
        this.NBR_CAGES = 25;
        this.animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }

    boolean addAnimal(Animal animal) {
        if(searchAnimal(animal.name) == -1 && nbrAnimals < NBR_CAGES) {
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

    void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }

    int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }
    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);
        this.animals[index] = null;
        return true;
    }

    boolean isZooFull()
    {
        return nbrAnimals == NBR_CAGES;

    }

    Zoo comparerZoo(Zoo a, Zoo b) {
        if(a.nbrAnimals>b.nbrAnimals)
        {
            return a;
        }
        return b;
    }



    public String toString() {
        return String.format("Name: %s, City: %s, Nombre de cages: %d", this.name, this.city, this.NBR_CAGES);
    }

    public static void main(String[] args) {
        Animal lion = new Animal("felin", "Black1", 20, false);
        Animal otter = new Animal("Mustelids", "ottie", 5, true);
        Animal lion1 = new Animal("felin", "Black2", 20, false);
        Zoo myZoo = new Zoo("aaa", "Tunis");
        Zoo myZoo2 = new Zoo("bb", "sousse");
       // myZoo.displayZoo(myZoo);
       // myZoo.ajouterAnimal(lion, 0);
       // System.out.println(myZoo.toString());
        myZoo.addAnimal(lion1);
        myZoo.addAnimal(otter);
        myZoo.addAnimal(lion);
        myZoo2.addAnimal(lion);
        myZoo.addAnimal(otter);
        myZoo.displayAnimals();
        int d=myZoo.searchAnimal("Black1");
        System.out.println(d);
        myZoo.removeAnimal(lion);
        myZoo.displayAnimals();
        Zoo myZoo3 = myZoo.comparerZoo(myZoo, myZoo2);
        System.out.println(myZoo3);


    }
}
