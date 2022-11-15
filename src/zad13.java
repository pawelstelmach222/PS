import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int pudelko;
        pudelko = 40;
        int porcja;
        porcja=10;
        int pierwsza_porcja = pudelko / porcja;
        int kalorie;
        kalorie = 300;
        int kalorie_1ciastka = kalorie / pierwsza_porcja;
        int zjedzoneciastka;
        System.out.println("Podaj liczbe zjedzonych ciastek");
        zjedzoneciastka = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Ilośćzjedzonych kalorii to: "+ zjedzoneciastka + kalorie_1ciastka);

    }
}
