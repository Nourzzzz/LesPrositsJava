package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {


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
        int d = myZoo.searchAnimal("Black1");
        System.out.println(d);
        myZoo.removeAnimal(lion);
        myZoo.displayAnimals();
        Zoo myZoo3 = myZoo.comparerZoo(myZoo, myZoo2);
        System.out.println(myZoo3);


    }
}