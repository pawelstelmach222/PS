import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String firstName = klawiatura.nextLine();
        System.out.println("Podaj  drugie imie: ");
        String middleName = klawiatura.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = klawiatura.nextLine();
        System.out.println("Inicjaly ");
        char firstInitial= firstName.charAt(0);
        System.out.println("Imienia: "+firstInitial);
        char middleInitial= middleName.charAt(0);
        System.out.println("Drugiego imienia: "+ middleInitial);
        char lastInitial= lastName.charAt(0);
        System.out.println("Nazwiska: "+ lastInitial);
    }
}
