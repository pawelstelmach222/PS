import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę punktów z trzech testów: ");
        int wyniki_z_testow1=klawiatura.nextInt();
        int wyniki_z_testow2=klawiatura.nextInt();
        int wyniki_z_testow3=klawiatura.nextInt();
        System.out.println("Wynik z 1 testu to: "+wyniki_z_testow1+" pkt");
        System.out.println("Wynik z 2 testu to: "+wyniki_z_testow2+" pkt");
        System.out.println("Wynik z 3 testu to: "+wyniki_z_testow3+" pkt");
        float srednia=wyniki_z_testow1+wyniki_z_testow2+wyniki_z_testow3;
        System.out.println("Średnia punktów wynosi: "+srednia/3+" pkt");
    }
}
