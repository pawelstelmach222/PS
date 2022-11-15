import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj cenę posiłku: ");
        int cena_posilku=klawiatura.nextInt();
        double podatek=cena_posilku*0.0675;
        double napiwek=cena_posilku*0.20;
        double laczna_kwota=cena_posilku+napiwek;
        System.out.println("Cena posiłku: "+cena_posilku+ " zł");
        System.out.println("Wartość podatku: "+podatek+" zł");
        System.out.println("Wysokość napiwku : "+napiwek+" zł");
        System.out.println("Łączna kwota do zapłaty to: "+laczna_kwota+" zł");
    }
}
