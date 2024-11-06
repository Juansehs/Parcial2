public class Laptop extends Producto implements Vendible {
    private String memoriaRAM;
    private String procesador;

    // Constructor
    public Laptop(String nombre, String marca, double precio, int cantidadStock, String memoriaRAM, String procesador) {
        super(nombre, marca, precio, cantidadStock);
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
    }

    // Getters y Setters
    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + getNombre() + ", Marca: " + getMarca() +
                ", Precio: $" + getPrecio() + ", Cantidad en stock: " + getCantidadStock() +
                ", Procesador: " + getProcesador() + ", Memoria RAM: " + getMemoriaRAM());
    }

    @Override
    public void preciodeventa() {

    }

    public double preciodeventa(int cantidad) {
        double totalVenta = cantidad * getPrecio();
        if (cantidad > 5) {
            totalVenta *= 0.9; // Aplicar descuento del 10%
            System.out.println("Descuento del 10% aplicado.");
        }
        return totalVenta;
    }
}
