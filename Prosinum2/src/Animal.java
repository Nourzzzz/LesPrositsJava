
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, Boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString() {
        return String.format("Family: %s, Name: %s, Age: %d, isMammal: %b", this.family, this.name, this.age, this.isMammal);//instruction 9
    }

    public static void main(String[] args) {
        Animal lion = new Animal("felin", "Black", 20, true);// instruction 6
        System.out.printf(lion.family);
        System.out.println(lion.toString());
    }
}






