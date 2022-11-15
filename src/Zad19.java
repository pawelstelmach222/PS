import java.util.Scanner;

public class Zad19 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int liczba_konsumentów=12467;
        double ankietowaniE=0.14;
        double smakcytrynowy=0.64;
       double energetyk= liczba_konsumentów*ankietowaniE;
       double energetykC= liczba_konsumentów*smakcytrynowy;
        System.out.println("Liczba ankietowanych kupujących przynajmniej jeden napój energetyczny: "+energetyk);
        System.out.println("Liczba akietowanych które preferują energetyki o smaku cytrusowym: "+energetykC);

    }
}
