package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food>{
    protected int nbrLegs;

    public Terrestrial(String family,String name,int age,boolean isMammal,int nbrLegs) throws InvalidAgeException  {
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;

    }
    public String toString() {
        return super.toString()+" nbrLegs=" + nbrLegs;
    }
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("L'animal terrestre mange de la viande : " + meat);
        } else {
            System.out.println("Cet animal terrestre ne mange pas de plantes seules.");
        }
    }
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("L'animal terrestre mange des plantes : " + plant);
        } else {
            System.out.println("Cet animal terrestre ne mange pas uniquement de la viande.");
        }
    }
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("L'animal terrestre mange des plantes et de la viande.");
        } else {
            System.out.println("Cet animal terrestre préfère manger les deux types de nourriture.");
        }
    }

}
