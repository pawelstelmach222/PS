public class zad5 {
    public static void main(String[] args) {
        int mieszkanie;
        int pomieszczenie1;
        int pomieszczenie2;
        int pomieszczenie3;
        int pomieszczenie4;
        int wymiar1 = 4;
        int wymiar2 = 3;
        int wymiar3 = 2;
        pomieszczenie1 =  wymiar1 * wymiar2;
        pomieszczenie2 =  wymiar1 * wymiar2;
        pomieszczenie3 = wymiar3 * wymiar2;
        pomieszczenie4 = wymiar3 * wymiar3;
        mieszkanie = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;
        System.out.println("Pomieszczenie pierwsze:" + pomieszczenie1 +"m");
        System.out.println("Pomieszczenie drugie:" + pomieszczenie2 +"m");
        System.out.println("Pomieszczenie trzecie:" + pomieszczenie3 +"m");
        System.out.println("Pomieszczenie czwarte:" + pomieszczenie4 +"m");
        System.out.println("Powierzchnia calego mieszkania wynosi:" + mieszkanie +"m");
    }
}
