public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private int precio;
    private int cantidad;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return this.id;
    }

    public String describe() {
        return "id: " + id + ". nombre: " + nombre + ". descripción: " + descripcion + ". precio: " + precio + ". cantidad: " + cantidad;
    }
}
