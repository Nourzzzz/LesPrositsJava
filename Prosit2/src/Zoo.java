public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
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

    public String toString() {
        return String.format("Name: %s, City: %s, Nombre de cages: %d", this.name, this.city, this.nbrCages);
    }

    public static void main(String[] args) {
        Animal lion = new Animal("felin", "Black", 20, false);
        new Animal("Mustelids", "ottie", 5, true);// instruction 7
        Zoo myZoo = new Zoo("aaa", "Tunis", 25);// instruction 6
        myZoo.ajouterAnimal(lion, 0);
        System.out.println(myZoo.toString());
    }
}
