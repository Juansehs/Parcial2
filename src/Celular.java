import java.util.Scanner;

public class Celular extends Producto implements Vendible {
    private int capacidadBateria;
    private String resolucionCamara;


    public Celular(String nombre, String marca, double precio, int cantidadStock, int capacidadBateria, String resolucionCamara) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.resolucionCamara = resolucionCamara;
    }


    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(String resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + getNombre() + ", Marca: " + getMarca() +
                ", Precio: $" + getPrecio() + ", Cantidad en stock: " + getCantidadStock() +
                ", Resolución de cámara: " + getResolucionCamara() +
                " MP, Capacidad de batería: " + getCapacidadBateria() + " mAh");
    }

    @Override
    public void preciodeventa() {

    }

    public double preciodeventa(int cantidad) {
        double totalVenta = cantidad * getPrecio();
        if (cantidad > 5) {
            totalVenta *= 0.9;
            System.out.println("Descuento del 10% aplicado.");
        }
        return totalVenta;
    }
}
