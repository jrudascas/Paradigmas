/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming;

/**
 *
 * @author jrudascas
 */
public class Test2 {

    public static void main(String[] arg) {
        
        AbstracClass abstracClass = new AbstracClass() {
            @Override
            void function1() {
                System.out.println("Implementación Clase Anonima");
            }
        };

        SaludoMañanaInterfac saludo = new SaludoMañanaInterfac() {
            @Override
            public void saludo2() {
                System.out.println("Implementación Interfaz Anonima");
            }
            
            /*@Override
            public void saludo22() {
                System.out.println("Implementación Interfaz Anonima");
            }*/
        };
        
        SaludoMañanaInterfac.saludo3();
        
        SaludoMañanaInterfac saludo2 = () -> System.out.println("Implementación Interfaz Anonima");         ;
    }
    
    
    public int function1(int z){
        return z + 2;
    }
}
