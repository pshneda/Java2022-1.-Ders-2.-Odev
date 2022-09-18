public class Main {
    public static void main(String[] args) {
        //for "i++"  ile   "i = i+1" yazımı arasında fark yoktur. Eksilt : i--
        //örnek durum : i=1 ise i+=2 ifadesi i rakamını 2 arttırarak saydırmaya yarar.
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("For Döngü Bitti");

        int i = 1;
        // while
        while (i<10) {

            System.out.println(i);
            i+=2;
        }
            System.out.println("While Döngüsü Bitti");

        //do while while döngüsünden farkı. şart sağlanmazsa dahi kod satırı çalışacaktır.
        //şart sağlandığında while gibi çalışır.
        int j=100;
        do {
            System.out.println(j);
            j += 2;
        }while(j<10);

        System.out.println("DoWhile Döngüsü Bitti");
    }
}