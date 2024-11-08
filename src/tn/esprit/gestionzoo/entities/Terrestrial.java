package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial(String family,String name,int age,boolean isMammal,int nbrLegs) throws InvalidAgeException  {
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;

    }
    public String toString() {
        return super.toString()+" nbrLegs=" + nbrLegs;
    }

}
