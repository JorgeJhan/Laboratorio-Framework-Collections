/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

/**
 *
 * @author jhanc
 */
public class Producto implements Comparable<Producto> {

    private final String nombre;
    private int cantidad;

//constructor de la clase producto
    public Producto(String s, int i) {
        nombre = s;
        cantidad = i;
    }
//método de la clase object

    public String toString() {
        return ("\nNombre: " + nombre + " \nCantidad: " + cantidad);
    }

//métodos de encapsulamiento
    public String getNombre() {
        return this.nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int compareTo(Producto o) {
        return nombre.compareTo(o.getNombre());

    }

}
