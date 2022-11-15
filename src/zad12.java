import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę przejechanych kilometrów: ");
        float kilometry=klawiatura.nextInt();
        System.out.println("Podaj ilość zużytych litrów paliwa: ");
        float litrypaliwa=klawiatura.nextInt();
        float kilometrynalitrze=kilometry/litrypaliwa;
        System.out.println("Na jednym litrze paliwa przejechałeś: "+ kilometrynalitrze);
    }
}
