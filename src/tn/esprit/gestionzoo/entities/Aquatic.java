package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.*;

public class Aquatic extends Animal implements Carnivore<Food>{
    protected String habitat;
    public Aquatic(String family,String name,int age,boolean isMammal,String habitat) throws InvalidAgeException {

        super(family,name,age,isMammal);
        this.habitat = habitat;

    }
    public String toString() {
        return super.toString()+"Aquatic{" + "habitat=" + habitat + '}';
    }
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("L'animal aquatique mange de la viande : " + meat);
        } else {
            System.out.println("Cet animal aquatique ne mange pas de plantes.");
        }
    }
    public static void swim(){
        System.out.println("This Aquatic Animal is swimming");
    }

    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (obj instanceof Aquatic aquatic) {
            return age == aquatic.age && name.equals(aquatic.name) && habitat.equals(aquatic.habitat);
        }

        return false;
    }


}
