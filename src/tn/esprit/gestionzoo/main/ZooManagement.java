package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {


    public static void main(String[] args) {
       /* Animal lion = new Animal("felin", "Black1", 20, false);
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
        System.out.println(myZoo3);*/
       /* Aquatic aquatic = new Aquatic("Aquatic", "aqua", 5, true,"ocean");
        Terrestrial  terrestrial = new Terrestrial("terrestre","terres", 5, true,2);
        Dolphin dolphin = new Dolphin("Mustelids", "ottie", 5, true,"ocean",82);
        Penguin penguin = new Penguin("pengy", "pengo", 5, true,"ocean",200);
        System.out.println(dolphin);
        System.out.println(penguin);
        aquatic.swim();
        dolphin.swim();
        penguin.swim();*/
        Animal aquatic = new Aquatic("Aquatic", "aqua", 5, true,"ocean");
        Animal dolphin = new Dolphin("Mustelids", "ottie", 5, true,"ocean",82);
        Animal penguin = new Penguin("pengy", "pengo", 5, true,"ocean",200);
        Zoo myZoo = new Zoo("aaa", "Tunis");
        myZoo.addAquaticAnimal((Aquatic) dolphin);
        myZoo.addAquaticAnimal((Aquatic) penguin);
        myZoo.addAquaticAnimal((Aquatic) aquatic);
        myZoo.displayAnimals();
        ((Dolphin) dolphin).swim();
        ((Penguin) penguin).swim();
        ((Aquatic) aquatic).swim();



    }
}