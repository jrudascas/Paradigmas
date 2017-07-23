package pytp;

class A {

    static int m = -1;

    public static void main(String arg[]) {
        System.out.println(f1());
        System.out.println(f2());
    }

    static int f3() {
        m++;
        return m - 1;
    }

    static int f4() {
        return f3();
    }

    static int f1() {
        return m + f3();
    }

    static int f2() {
        return f3() + m;
    }
}
