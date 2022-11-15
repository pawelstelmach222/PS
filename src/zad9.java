import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = klawiatura.nextLine();
        System.out.println("Podaj wiek: ");
        int age;
        age =  klawiatura.nextInt();
        System.out.println("Podaj oczekiwany roczny dochod: ");
        double annualPay = klawiatura.nextInt();

        System.out.println("Nazywam sie "+name+", mam "+age+" lat "+ "chce zarabiac "+annualPay+ " zlotych rocznie.");
    }
}
