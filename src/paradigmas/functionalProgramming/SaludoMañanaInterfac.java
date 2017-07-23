package functionalProgramming;

//Interfaz funcional
@FunctionalInterface
public interface SaludoMañanaInterfac {
    int a = 201;
    
    //Metodos abstractos
    void saludo2();
//    void saludo22();
    
    //Metodo Statico
    public static void saludo3(){
        System.out.println("Implementación metodo estatico interfaz");
    }
    
    //Metodo por defecto
    default void saludo() {
        System.out.println("Implementación metodo por defaul");
    }
}
