package verduleria.almacen;

import verduleria.Producto;

public class Lacteo extends Producto {

    private int cantindad;
    private int proteinas;
    private String cantidad;

    public Lacteo(String nombre, double precio, int cantindad, int proteinas) {
        super(nombre, precio);
        this.cantindad = cantindad;
        this.proteinas = proteinas;
    }

    public int getCantindad() {
        return cantindad;
    }

    public void setCantindad(int cantindad) {
        this.cantindad = cantindad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }


    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
