package Heuristica;

public class SimulatedAnnealing {

    static double Ti = 100000;
    static double Tf = 10000;
    static double dP = 0.05;
    
    static double dT = 0.5;
    static double C = 0.00013;
    static int maxV = 100;
    static int minV = -100;

    public static void main(String[] args) {
        
        double[] punto = new double[2];
        punto[0] = (Math.random() * (maxV - minV)) + minV;        
        punto[1] = (Math.random() * (maxV - minV)) + minV;

        double T = Ti;
        
        System.out.println("Solución Inicial");
        for (int i = 0; i < punto.length; i++) {
            System.out.println(punto[i]);
        }
        
        System.out.println();
        
        while (T > Tf) {
            int nIteracciones = 1;
            while (nIteracciones > 0) {
                double puntoPrima[] = perturbar(punto);
                double dZ = funcion(puntoPrima) - funcion(punto);
                if (dZ > 0) {
                    punto = puntoPrima;
                } 
                else {
                    if (Math.random() < funcionProbabilidad(dZ, T)) {
                        punto = puntoPrima;
                    }
                }
                nIteracciones--;
            }
            T = T - dT;
        }

        System.out.println("Solución Final");
        for (int i = 0; i < punto.length; i++) {
            System.out.println(punto[i]);
        }
    }

    public static double funcionProbabilidad(double deltaFuncion, double temperatura) {        
        return Math.exp(deltaFuncion / (C*temperatura));
    }

    public static double[] perturbar(double[] punto) {
        double factorPerturbacion;
        double[] puntoAux = new double[punto.length];
        for (int i = 0; i < punto.length; i++) {
            factorPerturbacion = ((Math.random() < 0.5) ? -1 : 1) * dP;
            puntoAux[i] = punto[i] + factorPerturbacion;
        }

        return puntoAux;
    }

    public static double funcion(double[] punto) {
        //z = -(x+14)^2 - (y-23)^2
        return -1*((punto[0]+14) * (punto[0]+14)) -1*((punto[1]-23) * (punto[1]-23));

        //y = -x^2
        //return (-1*((punto[0]-15) * (punto[0]-15))) + 100;
    }
}