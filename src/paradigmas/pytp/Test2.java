package pytp;

public class Test2 {

    public static void main(String arg[]) {
        System.out.println(f1("hola mundo"));
        System.out.println(f2(2, 5));
        System.out.println(f3());
    }

    public static String f1(String x) {
        return x.substring(0, 1).toUpperCase() + x.substring(1);
    }

    public static int f2(int a, int b) {
        int r;
        if (a % 2 == 0) {
            r = b + a * 2;
        } else {
            r = b * 5;
        }
        return r;
    }

    public static double f3() {
        return Math.PI;
    }
}
