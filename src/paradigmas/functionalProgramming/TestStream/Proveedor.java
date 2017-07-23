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
public class Proveedor {
    String razonSocial;
    String id;
    Ciudad ciudad;

    public Proveedor(String razonSocial, String id, Ciudad ciudad) {
        this.razonSocial = razonSocial;
        this.id = id;
        this.ciudad = ciudad;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getId() {
        return id;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
