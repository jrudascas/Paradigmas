package ProgramacionDinamica;

public class Cambio {

    static int[][] matrizCambio;
    static int[] vectorDenominaciones;
    static int cantidad;

    public static void main(String[] args) {
        int[] denominaciones = new int[]{1, 4, 6};

        Cambio c = new Cambio(7, denominaciones);

        imprimirMatriz(matrizCambio);
    }

    Cambio(int cantidad, int[] denominaciones) {
        this.cantidad = cantidad;
        this.vectorDenominaciones = denominaciones;
        matrizCambio = calcularMonedas(cantidad, denominaciones);        
    }

    private int[][] calcularMonedas(int cantidad, int[] denominaciones) {

        int[][] matrizCambio = new int[denominaciones.length+1][cantidad + 1];

        for (int i = 0; i <= denominaciones.length; i++) {
            matrizCambio[i][0] = 0;
        }

        for (int j = 1; j <= cantidad; j++) {
            matrizCambio[0][j] = j;
        }

        for (int i = 1; i <= denominaciones.length; i++) {
            for (int j = 1; j <= cantidad; j++) {
                if (j < denominaciones[i - 1]) {
                    matrizCambio[i][j] = matrizCambio[i - 1][j];
                } else {
                    matrizCambio[i][j] = Math.min(matrizCambio[i - 1][j], matrizCambio[i][j - denominaciones[i - 1]] + 1);
                }
            }
        }

        return matrizCambio;
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
