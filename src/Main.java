import java.util.ArrayList;
import java.util.List;

//juan sebastian hernandez silva//
// id 1002277//
        public class Main extends Producto  {
            public Main(String nombre, String marca, double precio, int cantidadStock) {
                super(nombre, marca, precio, cantidadStock);
            }

            public static void main(String[] args) {
                // Crear algunos productos
                Laptop laptop1 = new Laptop("Laptop Dell XPS", "Dell", 1200.0,  10, "16Gb", "Intel Core i7");
                Laptop laptop2=new Laptop("Asus","Zenboook",600.000,8,"32GB","Intel Core 8");
                Celular celular1 = new Celular("iPhone 13", "Apple", 800.0, 15, 4000, "12MP");
                Celular celular2 = new Celular("Samsung Galaxy S21", "Samsung", 750.0, 20, 4500, "108MP");

                Cliente cliente1 = new Cliente("Juan Perez", "juan.perez@mail.com");
                Cliente cliente2 = new Cliente("Maria Gomez", "maria.gomez@mail.com");

                cliente1.comprarProducto(laptop1, 6);
                cliente1.comprarProducto(celular1, 3);

                cliente2.comprarProducto(laptop1,6);
                cliente2.comprarProducto(celular2,3);


                System.out.println("Resumen de Compras:");
                cliente1.mostrarCompra();
                cliente2.mostrarCompra();

               
                System.out.println("\nInventario Actualizado:");
                laptop1.mostrarDetalles();
                laptop2.mostrarDetalles();
                celular1.mostrarDetalles();
                celular2.mostrarDetalles();
                
            }

            @Override
            public void mostrarDetalles() {

            }

            @Override
            public void preciodeventa() {

            }
        }