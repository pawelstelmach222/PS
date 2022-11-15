import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wartość kupionego produktu: ");
        double cena = klawiatura.nextInt();
        double podatekS = 0.04;
        double podatekL = 0.02;
        double cena1=cena*podatekS;
        double cena2=cena*podatekL;
        double cenaP=cena+cena1+cena2;
        System.out.println("Wartość produktu: "+cena+" zł");
        System.out.println("Podatek stanowy: "+cena1+" zł");
        System.out.println("Podatek lokalny: "+cena2+" zł");
        System.out.println("Laczna wartość produktu z podatkami: "+cenaP+" zł");

    }
}
