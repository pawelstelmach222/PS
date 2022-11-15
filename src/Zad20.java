import java.util.Scanner;

public class Zad20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double ProporcjeCukru= 1.5/48;
        double Proporcjemasla= 1.0/48;
        double Proporcjemaki= 2.75/48;
        System.out.println("Podaj ilosc ciastek do zrobienia: ");
        double Ilosc_ciastek_do_zrobienia = klawiatura.nextDouble();
        System.out.println("Żeby zrobić podana liczbę ciastek potrzebujesz: ");
        System.out.println(Ilosc_ciastek_do_zrobienia*ProporcjeCukru + " szklanek cukru");
        System.out.println(Ilosc_ciastek_do_zrobienia*Proporcjemasla + " szklanek masła");
        System.out.println(Ilosc_ciastek_do_zrobienia*Proporcjemaki + " szklanek mąki");

    }
}
