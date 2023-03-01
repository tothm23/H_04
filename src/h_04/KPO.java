package h_04;

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tóth Milán
 */
public class KPO {

    /*
    0 - kő
    1 - papír
    2 - olló
     */
    public static void main(String[] args) {
        new KPO();
    }

    public KPO() {
        Scanner sc = new Scanner(System.in);
        
        int usereredmeny;
        do {
            int geperedmeny = new Random().nextInt(3);

            menu();
            out.print("Válassz: ");
            usereredmeny = sc.nextInt();

            kiertekel(geperedmeny, usereredmeny);

        } while (usereredmeny != -1);
        sc.close();
    }

    /**
     * Kirajzolja a menüt
     */
    public static void menu() {
        out.println("\n===== ===== =====");
        out.println("   0 - kő  ");
        out.println("   1 - papír   ");
        out.println("   2 - olló    ");
        out.println("   -1 - kilépés    ");
        out.println("===== ===== =====\n");
    }

    /**
     * Meghatározza az eredményt
     *
     * @param usereredmeny
     * @param geperedmeny
     */
    public static void kiertekel(int usereredmeny, int geperedmeny) {
        if (usereredmeny < 0 || usereredmeny > 2) {
            out.println(usereredmeny + " Érvénytelen választás!");
        } else if (usereredmeny == geperedmeny) {
            out.println(geperedmeny + " - " + usereredmeny + " Döntetlen!");
        } else if (geperedmeny == 0 && usereredmeny == 1
                || geperedmeny == 1 && usereredmeny == 2
                || geperedmeny == 2 && usereredmeny == 0) {
            out.println(geperedmeny + " - " + usereredmeny + " Te nyertél");
        } else{
            out.println(geperedmeny + " - " + usereredmeny + " Gép nyert");
        }
    }
}
