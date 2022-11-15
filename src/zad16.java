import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwę twojego ulubionego miasta");
        String miasto =klawiatura.nextLine();

        System.out.println(miasto);
        int dlugosc;
        dlugosc = miasto.length();
        System.out.println("Liczba znaków w nazwie miasta wynosi: "+dlugosc);
        System.out.println("Nazwa miasta zapisana małymi literami: ");
        System.out.println(miasto.toLowerCase());
        System.out.println("Nazwa miasta zapisana wielkimi literami: ");
        System.out.println(miasto.toUpperCase());
        System.out.println("Pierwsza litera miasta: "+miasto.charAt(0));

    }
}
