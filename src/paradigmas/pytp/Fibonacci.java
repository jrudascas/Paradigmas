package pytp;

import java.util.Scanner;

/**
 *
 * @author jrudascas
 */
public class Fibonacci {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos numeros desea generar de la serie?");
        int num = scanner.nextInt();

        System.out.println();
        System.out.println("La serie generada es: ");
        System.out.println();

        for (int i = 1; i <= num; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
