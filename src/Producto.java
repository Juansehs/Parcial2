public abstract class Producto {
    private String nombre;
    private String marca;
    private double precio;
    private int cantidadstock;
    private int cantidad;

    public Producto() {
    }

    public Producto(String nombre, String marca, double precio, int cantidadstock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadstock = cantidadstock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadstock() {
        return cantidadstock;
    }

    public void setCantidadstock(int cantidadstock) {
        this.cantidadstock = cantidadstock;
    }
    abstract void mostradetalles ();
}

