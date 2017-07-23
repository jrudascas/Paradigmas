/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.TestStream;

/**
 *
 * @author jrudascas
 */
public class Ciudad {

    String nombre;
    int codigoPostal;

    public Ciudad(String nombre, int codigoPostal) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    @Override
    public boolean equals(Object o) {
        return getNombre() == o.toString();
    }
}
