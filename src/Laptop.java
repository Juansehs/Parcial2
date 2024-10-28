import java.util.Scanner;

public class Laptop extends Producto implements Vendible {
    String MemoriaRAM;
    String Procesador;
    private int cantidad;

    public Laptop(String nombre, String marca, double precio, int cantidadstock, String memoriaRAM, String procesador) {
        super(nombre, marca, precio, cantidadstock);
        MemoriaRAM = memoriaRAM;
        Procesador = procesador;
    }


    public Laptop() {
    }

    public String getMemoriaRAM() {
        return MemoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        MemoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public Laptop(String memoriaRAM, String procesador) {
        MemoriaRAM = memoriaRAM;
        Procesador = procesador;

    }

    @Override
    void mostradetalles() {
        System.out.println("el producto es: " + getNombre() + "La marca es " + getMarca()
                + "su precio es:" + getPrecio() + "la cantidad disponible es de :" + getCantidadstock() + "Posee" + getProcesador() + "de Procesador" + "y " + getMemoriaRAM() + "de memoria Ram");
    }

    @Override
    public void preciodeventa() {
        System.out.println("¿Cuantas unidades quieres comprar?");
        Scanner input = new Scanner(System.in);
        cantidad = input.nextInt();
        double totaldeventa;
        totaldeventa = cantidad * getPrecio();
        if (cantidad > 5) {
            System.out.println("Tienes un 10% de descuento disponible por lo tanto te queda en:" + totaldeventa * 0.10);
        }
    }
}
