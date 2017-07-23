package pytp;

class MiClase {

    public int valor;
}

public class Test {

    public static void main(String[] args) {

        MiClase m1 = new MiClase();
        m1.valor = 2;
        System.out.println(m1.valor);
        cambiar(m1);
        System.out.println(m1.valor);

        int num1 = 10;
        System.out.println(num1);
        cambiar(num1);
        System.out.println(num1);
    }

    public static void cambiar(MiClase n) {
        n.valor = 3;
    }

    public static void cambiar(int n) {
        n = 3;
    }
}
