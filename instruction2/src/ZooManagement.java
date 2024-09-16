import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        //int nbrCages = 20;
        //String zooName = " my zoo ";
        Scanner scanner = new Scanner(System.in);
        //System.out.println(nbrCages); // c juste pour verifier si c possible pas demande dans le cours
        System.out.println("donner le nombre de cage :");
        int nbrCages = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("donner le nom de zoo :");
        System.out.printf(zooName  +  " comporte " + nbrCages + " cages ");
        String zooName = scanner.next();


}
}