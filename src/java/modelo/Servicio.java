package modelo;

import java.util.ArrayList;
import javax.ejb.Singleton;

@Singleton
public class Servicio implements ServicioLocal {
    private ArrayList<Producto> lista = new ArrayList();

    public Servicio() {
        lista.add(new Producto("Bicicleta", 120000));
        lista.add(new Producto("Casco", 20000));
    }

    @Override
    public void addProducto(Producto p) {
        lista.add(p);
    }

    @Override
    public ArrayList<Producto> getProductos() {
        return lista;
    } 
}
