package ProgramacionDinamica;

public class Fibonacci {

    public static long[] tabla;
    
    public static void main(String[] args) {
        int numero = 1000;
        tabla = new long[numero+1];
        System.out.println(fib(numero));
    }    

    public static long fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        if (tabla[n] >= 0) {
            tabla[n] = fib(n - 1) + fib(n - 2);            
        } 
        
        return tabla[n];
    }
}
