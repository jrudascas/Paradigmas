package functionalProgramming.TestStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] arg) {
        List<Transaccion> transacciones = new ArrayList<>();

        transacciones.add(new Transaccion("A9820", 15520, new Date(92828373), new Proveedor("CompyTem SAS", "800828293-1", new Ciudad("Medellin", 2223131))));
        transacciones.add(new Transaccion("A9818", 10002, new Date(12313213), new Proveedor("CocaCola SA", "800228991-4", new Ciudad("Bogota", 3123123))));
        transacciones.add(new Transaccion("A9821", 67001, new Date(433213), new Proveedor("PanelasColombia SA", "8003213451-2", new Ciudad("Bogota", 3123123))));
        transacciones.add(new Transaccion("A9819", 41400, new Date(14643213), new Proveedor("Familia SA", "800321361-2", new Ciudad("Barranquilla", 1112313))));
        transacciones.add(new Transaccion("A9822", 23400, new Date(14643213), new Proveedor("Familia SA", "800321361-2", new Ciudad("Barranquilla", 1112313))));
        transacciones.add(new Transaccion("A9817", 17400, new Date(14643213), new Proveedor("Familia SA", "800321361-2", new Ciudad("Barranquilla", 1112313))));

        /*int suma = 0;
        for (Transaccion t1: transacciones){
            if (t1.getProveedor().getCiudad().getNombre().equals("Bogota")){
                suma = suma + t1.getPrecio();
            }
        }*/
                
        //Suma los precios de las transaccion realizadas en la ciudad de Bogotá
        
        int sum = transacciones.stream().
                filter(t -> t.getProveedor().getCiudad().equals("Bogota")).
                mapToInt(Transaccion::getPrecio).
                sum();
        
        System.out.println("1. " + sum);

        //Lista de ciudades diferentes
        List <String> ciudades= new ArrayList();
        for(Transaccion t: transacciones){
            for(String t2:ciudades){
                
                if(t2.equals(t.getProveedor().getCiudad().getNombre())){
                
                break;
                }else{
                    ciudades.add(t.getProveedor().getCiudad().getNombre());
                }
                
            }
            
                    
                    }
            System.out.println("2. " + Arrays.asList(ciudades.toArray()));
           
        
        Stream list = transacciones.stream().
                map(t -> t.getProveedor().getCiudad().getNombre()).
                distinct();
        System.out.println("2. " + Arrays.asList(list.toArray()));

        
        //Transaccion con el precio mas alto
        Optional<Transaccion> max = transacciones.stream().
                max(Comparator.comparingDouble(Transaccion::getPrecio));
        System.out.println("3. " + max.get().getId());

        boolean b=false;
        for(Transaccion t: transacciones){
            if(t.getPrecio()>10001){
               b=true; 
            }
        }
        System.out.println(""+b);
        
        //Todas las transaccion tienen precio superior a 10001?
        boolean flag = transacciones.stream().
                allMatch(t -> t.getPrecio() > 10001);
        System.out.println("4. " + flag);

        //Ordenamiento de colecciones
        Transaccion[] listTransaccion = transacciones.toArray(new Transaccion[0]);
        Transaccion[] listTransaccion2 = transacciones.toArray(new Transaccion[0]);

        System.out.println("5. " + Arrays.asList(listTransaccion));
        
        Arrays.sort(listTransaccion, Transaccion.TransaccionNameComparator);
        
        System.out.println("6. " + Arrays.asList(listTransaccion));

        System.out.println("7. " + Arrays.asList(listTransaccion2));
        
        Arrays.sort(listTransaccion2, (Transaccion t1, Transaccion t2) -> t2.getId().compareTo(t1.getId()));
        
        System.out.println("8. " + Arrays.asList(listTransaccion2));

        int suma2 = 0;
        for (Transaccion t: transacciones){
            suma2 = suma2 + t.getPrecio();
        }
        
        //Obtiene la suma de los precios para las transacciones
        Integer suma = transacciones.stream().mapToInt(Transaccion::getPrecio).reduce(0, (x, y) -> x + y);
        System.out.println("9. " + suma);
        
        //Obtiene el maximo precio de la transaccion par
        
        int max2 = -1;
        for (Transaccion t: transacciones){
            if (t.getPrecio() % 2 == 0){
                if (t.getPrecio() > max2)
                    max2 = t.getPrecio();
            }
        }
        System.out.println(max2);
        
        OptionalInt opt = transacciones.stream().
                mapToInt(Transaccion::getPrecio).
                filter(x -> x % 2 == 0).
                reduce(Integer::max);

        System.out.println("10. " + opt.getAsInt());
    }
    
    public static int[] ordenarBurbuja(int[] vector) {
        int temp;
        int [] vecAux = vector.clone();
        
        for (int i = 1; i < vecAux.length; i++) {
            for (int j = 0; j < vecAux.length - 1; j++) {
                if (vecAux[j] > vecAux[j + 1]) {
                    temp = vecAux[j];
                    vecAux[j] = vecAux[j + 1];
                    vecAux[j + 1] = temp;
                }
            }
        }

        return vecAux;
    }

}
