import java.util.Scanner;

public class Zad21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int kwota_pieniedzy_na_koncie_po_określonej_liczbie_lat;
        double pierwotna_zadeponowana_kwota;
        double roczna_stopa_oprocentowania;
        int odsetki;
        int liczba_lat;
        System.out.println("Ile pieniędzy zadeponowałeś na początku: ");
        pierwotna_zadeponowana_kwota= klawiatura.nextDouble();
        System.out.println("Jaka jest roczna stopa oprocentowania: ");
        roczna_stopa_oprocentowania= klawiatura.nextDouble();
        System.out.println("Ile razy w roku odsetki są kapitalizowane ( przy kapitalizacji miesięcznej wpisz 12,a przy kapitalizacji kwartalnej — 4)");
        odsetki= klawiatura.nextInt();
        System.out.println("Podaj liczbę lat, przez jakie środki będą znajdować się na koncie i generować odsetki ");
        liczba_lat= klawiatura.nextInt();

        kwota_pieniedzy_na_koncie_po_określonej_liczbie_lat=pierwotna_zadeponowana_kwota(1+roczna_stopa_oprocentowania/odsetki)*liczba_lat;
        System.out.println("Po tym czasie na twoim koncie jest: "+kwota_pieniedzy_na_koncie_po_określonej_liczbie_lat+" zł");


    }

    private static int pierwotna_zadeponowana_kwota(double v) {
                                                return 0;
    }
}
