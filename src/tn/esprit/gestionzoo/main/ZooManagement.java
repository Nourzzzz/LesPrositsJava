package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {


    public static void main(String[] args) throws InvalidAgeException{

      /*
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
        penguin.swim();
        Aquatic aquatic = new Aquatic("Aquatic", "aqua", 5, true,"ocean");
        Aquatic dolphin = new Dolphin("Mustelids", "ottie", 5, true,"ocean",82);
        Aquatic penguin = new Penguin("pengy", "pengo", 5, true,"ocean",200);
        Aquatic penguin1 = new Penguin("pengy", "pengo", 5, true,"ocean",1000);
        Zoo myZoo = new Zoo("aaa", "Tunis");
        myZoo.addAquaticAnimal((Aquatic) dolphin);
        myZoo.addAquaticAnimal((Aquatic) penguin);
        myZoo.addAquaticAnimal((Aquatic) aquatic);
        myZoo.addAquaticAnimal((Aquatic) penguin1);
        myZoo.displayAnimals();
        ((Dolphin) dolphin).swim();
        ((Penguin) penguin).swim();
        ((Aquatic) aquatic).swim();
        float max = myZoo.maxPenguinSwimmingDepth();
        System.out.println(max);
        myZoo.displayNumberOfAquaticsByTypes();*/
       /* Animal lion = new Animal("felin", "Black1", 20, false);
        Animal otter = new Animal("Mustelids", "ottie", 5, true);
        Animal shark = new Animal("shark ", "shark ", 20, false);
        Animal giraffe = new Animal("giraffe", "giraffe", -20, false);
        Zoo myZoo = new Zoo("aaa", "Tunis");
        try {


            myZoo.addAnimal(lion);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getNbrAnimals());

            myZoo.addAnimal(otter);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getNbrAnimals());

            myZoo.addAnimal(giraffe);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getNbrAnimals());

            myZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        myZoo.displayZoo(myZoo);
    */
            Aquatic dolphin = new Dolphin("Mustelids", "ottie", 5, true,"ocean",82);
            Terrestrial chat = new Terrestrial("chat", "chat", 5, true, 4);
            Penguin penguin = new Penguin("pengy", "pengo", 5, true,"ocean",200);
            dolphin.eatMeat(Food.MEAT);
            penguin.eatMeat(Food.MEAT);
            dolphin.eatMeat(Food.PLANT);
            chat .eatMeat(Food.MEAT);
            chat .eatPlant(Food.PLANT);
            chat .eatPlantAndMeat(Food.BOTH);

    }
}