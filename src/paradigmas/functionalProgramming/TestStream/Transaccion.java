package functionalProgramming.TestStream;

import java.util.Comparator;
import java.util.Date;

public class Transaccion {

    String id;
    int precio;
    Date fecha;
    Proveedor proveedor;

    public static Comparator<Transaccion> TransaccionNameComparator = new Comparator<Transaccion>() {

        @Override
        public int compare(Transaccion t1, Transaccion t2) {                    //Asc
            return t2.getId().compareTo(t1.getId());
        }

    };

    public Transaccion(String id, int precio, Date fecha, Proveedor proveedor) {
        this.id = id;
        this.precio = precio;
        this.fecha = fecha;
        this.proveedor = proveedor;
    }

    public String getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    @Override
    public String toString(){
        return getId();
    }
}
