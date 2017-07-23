/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.example;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        Datos tratarDatos = new Datos();
        
        //Uso de lambdas contexto de paso de parametros
        List<String> lista = tratarDatos.obtenerDatos(new FiltrarInterfaces() {

            @Override
            public List<String> filtra(List<String> datos) {
                return datos.subList(2, 4);
            }
        });

        List<String> lista2 = tratarDatos.obtenerDatos(kkk -> kkk.subList(0, 2));

        List<String> lista3 = tratarDatos.obtenerDatos(datos -> {
            if (datos.isEmpty()) {
                return datos;
            } else {
                return datos.subList(2, 4);
            }
        });

        List<String> lista4 = tratarDatos.obtenerDatos(datos -> new Test1().filtro(datos));

        //Uso de lambdas contexto de asignacion (Creacion de una instancia de una interfaz)
        
        FiltrarInterfaces filtro = (List<String> datos) -> datos.subList(2, 4);
        //FiltrarInterfaces filtro2 = (datos) -> datos.subList(2, 4);
        List<String> lista5 = tratarDatos.obtenerDatos(filtro);
        
        System.out.println("Resultado: " + Arrays.toString(lista.toArray()));
        System.out.println("Resultado: " + Arrays.toString(lista2.toArray()));
        System.out.println("Resultado: " + Arrays.toString(lista3.toArray()));
        System.out.println("Resultado: " + Arrays.toString(lista4.toArray()));
        System.out.println("Resultado: " + Arrays.toString(lista5.toArray()));
    }

    private List<String> filtro(List<String> datos) {
        if (datos.isEmpty()) {
            return datos;
        } else {
            return datos.subList(2, 4);
        }
    }
}
