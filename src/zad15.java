import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        int detal;
        System.out.println("Podaj cenę detaliczną jednej płytki: ");
        detal=klawiatura.nextInt();
        double zysk = detal * 0.4;
        System.out.println("Cena jednej drukowanej płytki wynosi: "+detal+" zł");
        System.out.println("Zysk z jednej drukowanej płytyki wynosi:  "+zysk+" zł");



    }
}
