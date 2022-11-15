import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
       Scanner klawiatura = new Scanner(System.in);

        int wymiar1;
        int dlugosc1;
        int szerokosc1;
        int powierzchnia1;
        System.out.println("Podaj dlugosc pokoju nr.1: ");
        dlugosc1 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokosc pokoju nr.1: ");
        szerokosc1 = klawiatura.nextInt();
        klawiatura.nextLine();
        powierzchnia1 = dlugosc1 * szerokosc1;

        int wymiar2;
        int dlugosc2;
        int szerokosc2;
        int powierzchnia2;
        System.out.println("Podaj dlugosc pokoju nr.2: ");
        dlugosc2 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokosc pokoju nr.2: ");
        szerokosc2 = klawiatura.nextInt();
        klawiatura.nextLine();
        powierzchnia2 = dlugosc2 * szerokosc2;

        int wymiar3;
        int dlugosc3;
        int szerokosc3;
        int powierzchnia3;
        System.out.println("Podaj dlugosc pokoju nr.3: ");
        dlugosc3 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokosc pokoju nr.3: ");
        szerokosc3 = klawiatura.nextInt();
        klawiatura.nextLine();
        powierzchnia3 = dlugosc3 * szerokosc3;

        int wymiar4;
        int dlugosc4;
        int szerokosc4;
        int powierzchnia4;
        System.out.println("Podaj dlugosc pokoju nr.4: ");
        dlugosc4 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokosc pokoju nr.4: ");
        szerokosc4 = klawiatura.nextInt();
        klawiatura.nextLine();
        powierzchnia4 = dlugosc4 * szerokosc4;

        float osoba;
        osoba = powierzchnia1+powierzchnia2+powierzchnia3+powierzchnia4;

        System.out.println("Wymiary pokoju 1 to: "+ dlugosc1 +"x" + szerokosc1);
        System.out.println("Wymiary pokoju 2 to: "+ dlugosc2 +"x" + szerokosc2);
        System.out.println("Wymiary pokoju 3 to: "+ dlugosc3 +"x" + szerokosc3);
        System.out.println("Wymiary pokoju 4 to: "+ dlugosc4 +"x" + szerokosc4);
        System.out.println("Powierzchnia pokoju 1 to: "+ powierzchnia1 + "m");
        System.out.println("Powierzchnia pokoju 2 to: "+ powierzchnia2 + "m");
        System.out.println("Powierzchnia pokoju 3 to: "+ powierzchnia3 + "m");
        System.out.println("Powierzchnia pokoju 4 to: "+ powierzchnia4 + "m");
        System.out.println("Powierzchnia przypadająca na jedna osobe wynosi: "+osoba/4);
    }
}
