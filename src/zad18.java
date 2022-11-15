import java.util.Scanner;

public class zad18 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int liczba_akcji=600;
        double cena_za_akcje=21.77;
        double cena_inwestycji=liczba_akcji*cena_za_akcje;
        double prowizja=0.02;
        double wartosc_prowizji=cena_inwestycji*prowizja;
        double laczna_cena=wartosc_prowizji+cena_inwestycji;
        System.out.println("Kwota zapłacona za akcje wynosi: "+cena_inwestycji+" zł");
        System.out.println("Wysokość prowizji wynosi: "+wartosc_prowizji+" zł");
        System.out.println("Łączna kwota zapłacona wynosi: "+laczna_cena+" zł");

    }
}
