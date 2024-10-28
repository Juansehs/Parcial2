import java.util.Scanner;

public class Celular  extends Producto implements Vendible{
    private String capacidadebateria;
    private String resoluciondecamara;
    private int cantidad;

    public Celular(String capacidadebateria, String resoluciondecamara) {
        this.capacidadebateria = capacidadebateria;
        this.resoluciondecamara = resoluciondecamara;
    }

    public Celular(String nombre, String marca, double precio, int cantidadstock, String capacidadebateria, String resoluciondecamara) {
        super(nombre, marca, precio, cantidadstock);
        this.capacidadebateria = capacidadebateria;
        this.resoluciondecamara = resoluciondecamara;
    }

    public String getCapacidadebateria() {
        return capacidadebateria;
    }

    public void setCapacidadebateria(String capacidadebateria) {
        this.capacidadebateria = capacidadebateria;
    }

    public String getResoluciondecamara() {
        return resoluciondecamara;
    }

    public void setResoluciondecamara(String resoluciondecamara) {
        this.resoluciondecamara = resoluciondecamara;
    }

    @Override
    void mostradetalles() {
        System.out.println("el producto es: "+getNombre()+"La marca es "+getMarca()
                +"su precio es:"+getPrecio()+"la cantidad disponible es de :"+getCantidadstock()+"Tiene por definicion en camara"+getResoluciondecamara()+"Megapixeles"+"y "+getCapacidadebateria()+"de Capacidad de bateria");
    }

    @Override
    public void preciodeventa() {
        System.out.println("¿Cuantas unidades quieres comprar?");
        Scanner input = new Scanner(System.in);
        cantidad = input.nextInt();
        double totaldeventa;
        totaldeventa = cantidad * getPrecio();
        if (cantidad > 5)
            System.out.println("Tienes un 10% de descuento disponible por lo tanto te queda en:" + totaldeventa * 0.10);
    }}

