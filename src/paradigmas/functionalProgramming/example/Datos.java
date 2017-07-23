/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.example;

import java.util.ArrayList;
import java.util.List;

public class Datos {

    List<String> lista = new ArrayList<>();

    public Datos() {
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
    }

    List<String> obtenerDatos(FiltrarInterfaces recuperador) {
        return recuperador.filtra(lista);
    }

}
