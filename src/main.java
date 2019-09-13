/**
 * Napisz program, w którym użytkownik podaje liczbę całkowitą, a następnie w konsoli rysowany jest romb, którego boki
 * składają się z tylu gwiazdek co liczba zadana w programie.
 *
 * Przykładowy wynik dla liczby 7:
 *       *******
 *      *******
 *     *******
 *    *******
 *   *******
 *  *******
 * *******
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float startNumber = 0;
        System.out.println("podaj liczbę");
        int userNumber = scan.nextInt();


        for (int i = 0; i < userNumber; i++) {

                for (int j = 0; j < userNumber - i - 1; j++) {
                    System.out.print(" ");                      // spacja
                }

                for (int j = 0; j < userNumber; j++) {
                    System.out.print("*");                      // gwiazdka
                }
                System.out.println();                           //new line
        }
    }
}
