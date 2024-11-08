package tn.esprit.gestionzoo.entities;


public class Animal {
    protected  String family;
    protected   String name;
    protected   int age;
    protected boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif : " + age);
        }
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }


    public String toString() {
        return String.format("Family: %s, Name: %s, Age: %d, isMammal: %b", this.family, this.name, this.age, this.isMammal);//instruction 9
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("l'age doit etre positive >0");
        }
        else{
            this.age = age;
        }

    }
    public void setFamily(String family) {
        this.family = family;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMammal(Boolean isMammal) {
        this.isMammal = isMammal;
    }

    public int getAge() {
        return age;
    }
    public String getFamily() {
           return family;
    }
    public String getName() {
        return name;
    }
    public boolean isMammal() {
        return isMammal;
    }



    public static void main(String[] args) throws InvalidAgeException {
        Animal lion = new Animal("felin", "Black", 20, true);// instruction 6
        System.out.printf(lion.family);
        System.out.println(lion.toString());
    }
}






