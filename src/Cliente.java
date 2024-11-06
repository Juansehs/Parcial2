import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados;


    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadStock() >= cantidad) {
            productosComprados.add(producto);
            producto.setCantidadStock(producto.getCantidadStock() - cantidad);
            System.out.println("Compra exitosa de " + cantidad + " unidad(es) de " + producto.getNombre());
        } else {
            System.out.println("Stock insuficiente para " + producto.getNombre());
        }
    }


    public void mostrarCompra() {
        System.out.println("Compras de " + nombre + ":");
        double total = 0;
        for (Producto producto : productosComprados) {
            double precioProducto = producto.getPrecio();
            total += precioProducto;
            System.out.println("- " + producto.getNombre() + " (" + producto.getMarca() + "), Precio: $" + precioProducto);
        }
        System.out.println("Total de la compra: $" + total);
    }
}
