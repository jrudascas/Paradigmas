package 
pytp;

public class PyTP {

    @FunctionalInterface
    interface Suma{
        public Integer SumarDosNumeros(Integer num1, Integer num2);
    }
    
    public static void main(String[] args) {
        /*Suma suma = new Suma() {
            @Override
            public Integer SumarDosNumeros(Integer num1, Integer num2) {
                return num1 + num2;
            }
        };*/

        Suma suma = (n1, n2) -> n1 + n2;
        System.out.println(suma.SumarDosNumeros(3, 34));
    }
    
}
