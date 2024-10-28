import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Producto {
    private String nombre;
    private String correo;
    List<String> Productoscomprados = new ArrayList<>();

    public Cliente() {
    }

    public List<String> getProductoscomprados() {
        return Productoscomprados;
    }

    public void setProductoscomprados(List<String> productoscomprados) {
        Productoscomprados = productoscomprados;
    }

    public Cliente(String nombre, String marca, double precio, int cantidadstock, String nombre1, String correo, List<String> productoscomprados) {
        super(nombre, marca, precio, cantidadstock);
        this.nombre = nombre1;
        this.correo = correo;
        Productoscomprados = productoscomprados;

    }

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
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

    public void comprarproducto() {
        System.out.println();
    }

    public void mostrarcompra() {
        System.out.println("¿   Que producto quieres comprar?");
        int opcionmenu;
        Scanner input = new Scanner(System.in);
        opcionmenu= input.nextInt();
while (true){
    System.out.println("Bienvenido ¿que deseas comprar? \n(1) Laptop \n(2) Celular");
  switch (opcionmenu){
      case 1:
          System.out.println("Los Productos disponible son "+getCantidadstock());
    }
}

    }

    @Override
    void mostradetalles() {
        System.out.println("Usted compro ");
    }
}
