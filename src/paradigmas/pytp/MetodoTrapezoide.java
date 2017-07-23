package pytp;

/**
 *
 * @author jrudascas
 */

import java.util.Scanner;

public class MetodoTrapezoide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite los valores del intervalo a evaluar");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Digite el numero pasos a evaluar");

        int paso = scanner.nextInt();
        System.out.println("El area de la funcion es: " + integrar(a, b, paso));
    }

    static double integrar(double a, double b, int N) {
        double h = (b - a) / N;
        double x = 0;
        double area = (funcion(a) + funcion(b)) / 2;
        
        for (int i = 1; i < N; i++) {
            x = a + h * i;
            area = area + funcion(x);
        }

        return area * h;
    }

    private static double funcion(double x) {
        return Math.pow(x, 4) - Math.sin(x); //x4 - sin(x)
    }
}
