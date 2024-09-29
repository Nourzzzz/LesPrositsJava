public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages;
    int nbrAnimals;

    public Zoo(String name, String city) {
        this.nbrCages = 25;
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    boolean addAnimal(Animal animal) {
        if(searchAnimal(animal.name) == -1 && nbrAnimals < nbrCages) {
            this.animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }


    public void ajouterAnimal(Animal animal, int cageNumber) {
        if (cageNumber >= 0 && cageNumber < this.nbrCages) {
            this.animals[cageNumber] = animal;
        } else {
            System.out.println("Numéro de cage invalide");
        }

    }

    public void displayZoo(Zoo a) {
        System.out.printf("Name: " + a.name);
        System.out.printf("City: " + a.city);
        System.out.printf("Nombre de cage: " + a.nbrCages);
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



    public String toString() {
        return String.format("Name: %s, City: %s, Nombre de cages: %d", this.name, this.city, this.nbrCages);
    }

    public static void main(String[] args) {
        Animal lion = new Animal("felin", "Black1", 20, false);
        Animal otter = new Animal("Mustelids", "ottie", 5, true);
        Animal lion1 = new Animal("felin", "Black2", 20, false);
        Zoo myZoo = new Zoo("aaa", "Tunis");
       // myZoo.displayZoo(myZoo);
       // myZoo.ajouterAnimal(lion, 0);
       // System.out.println(myZoo.toString());
        myZoo.addAnimal(lion1);
        myZoo.addAnimal(otter);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(otter);
        myZoo.displayAnimals();
        int d=myZoo.searchAnimal("Black1");
        System.out.println(d);


    }
}
