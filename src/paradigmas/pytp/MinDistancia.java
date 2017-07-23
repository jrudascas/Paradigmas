package pytp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jrudascas
 */
public class MinDistancia {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList> puntos = new ArrayList<>();

        System.out.println("Digite el número de puntos a evaluar");
        int num = scanner.nextInt();

        System.out.println("Digite la dimension de los puntos");
        int dim = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Coordenadas del punto " + i);
            System.out.println("");

            ArrayList<Double> cordenadas = new ArrayList<>();

            for (int j = 1; j <= dim; j++) {
                System.out.println("Digite la coordenada numero " + j);
                cordenadas.add(scanner.nextDouble());
            }

            puntos.add(cordenadas);

            System.out.println("");
        }

        double distancias[][] = new double[num][num];

        for (int i = 1; i < num; i++) {
            for (int j = i + 1; j <= num; j++) {
                distancias[i - 1][j - 1] = distanciaDosPuntos(puntos.get(i - 1), puntos.get(j - 1));
            }
        }

        buscarMin(distancias);
    }

    private static double distanciaDosPuntos(ArrayList<Double> p1, ArrayList<Double> p2) {
        double dist = 0;
        for (int i = 1; i <= p1.size(); i++) {
            dist = dist + Math.pow(p1.get(i - 1) - p2.get(i - 1), 2);
        }

        return Math.sqrt(dist);
    }

    private static void buscarMin(double[][] distancias) {
        double min = 99999;
        int indexPunto1 = 0;
        int indexPunto2 = 0;
        for (int i = 0; i < distancias.length - 1; i++) {
            for (int j = i + 1; j <= distancias.length - 1; j++) {
                //System.out.print(distancias[i][j] + " ");
                if (distancias[i][j] < min) {
                    min = distancias[i][j];
                    indexPunto1 = i + 1;
                    indexPunto2 = j + 1;
                }                
            }
            //System.out.println();
        }
        
        System.out.println("La distancia minima esta entre los puntos " + indexPunto1 + " y el punto " + indexPunto2 + " con valor de " + min);
    }
}
