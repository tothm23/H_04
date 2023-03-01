package h_04;

import static java.lang.System.out;

/**
 *
 * @author Tóth Milán
 */
public class Fibonacci {

    public static void main(String[] args) {
        int db = 1;
        int i = 1;

        while (true) {
            out.println(i);
            if (db == 12) {
                break;
            }
            i += i;
            db++;
        }
    }

}
