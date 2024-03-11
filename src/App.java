import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Producto> productos = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


while (true) {
    System.out.println("1. Listar productos");
    System.out.println("2. Buscar producto por ID");
    System.out.println("3. Agregar producto");
    System.out.println("4. Modificar producto");
    System.out.println("5. Eliminar producto");
    System.out.println("0. Salir");



    int opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
            listarProductos();
            break;
        case 2:
            System.out.println("Ingrese el ID del producto: ");
            int id = scanner.nextInt();
            String productoEncontrado = buscarProductoPorId(id);
            if (productoEncontrado != null) {
                System.out.println("Producto encontrado: " + productoEncontrado);
            } else {
                System.out.println("Producto con ID " + id + " no encontrado");
            }
            break;
        case 3:
            Scanner input = new Scanner(System.in); 
            
            Producto nuevoProducto = new Producto();
            
            System.out.println("ingrese id del producto");
            int idProductoN = input.nextInt();
            nuevoProducto.setId(idProductoN);
            
            System.out.println("Ingrese nombre del producto");
            String nombreProductoN = input.next();
            nuevoProducto.setNombre(nombreProductoN);

            System.out.println("Ingrese el precio del producto");
            int precioProductoN = input.nextInt();
            nuevoProducto.setPrecio(precioProductoN);
            
            System.out.println("Ingrese la descripcion del producto");
            String descrProductoN = input.next();
            nuevoProducto.setDescripcion(descrProductoN);
            
            
            System.out.println("Ingrese la cantidad del producto");
            int precioCantN = input.nextInt();
            nuevoProducto.setPrecio(precioCantN);

            agregarProducto(nuevoProducto);

            break;
        case 4:
            System.out.println("Ingrese el id del producto que desea modificar");
            int idModificar = scanner.nextInt();
            Producto productoModiEncontrado = buscarProductoPorIdM(idModificar);
            if (productoModiEncontrado != null) {
                System.out.println("Producto encontrado: " + productoModiEncontrado.describe());

                modificarProducto(productoModiEncontrado);

            } else {
                System.out.println("Producto con ID " + idModificar + " no encontrado");
            }

            case 5:

    }

    System.out.println("¿Desea continuar? (S/N)");
    String respuesta = scanner.nextLine();
    if (respuesta.equalsIgnoreCase("N")) {
        break;
    }
}

    }

    private static void listarProductos() {
        for (Producto producto : productos) {


            System.out.println(producto.describe());
        }
    }
    
    private static String buscarProductoPorId(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto.describe();
            }
        }
        return null;
    }

    private static Producto buscarProductoPorIdM(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }
    
    private static void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    private static void modificarProducto(Producto producto) {
        /* for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == producto.getId()) {
                productos.set(i, producto);
                break;
            }
        } */

        Scanner modificarP = new Scanner(System.in);

        System.out.println("Ingrese nuevo nombre");
        String nNombreP = modificarP.nextLine();
        producto.setNombre(nNombreP);

        System.out.println("Ingrese nuevo precio");
        int nPrecioP = modificarP.nextInt();
        producto.setPrecio(nPrecioP);

        System.out.println("Ingrese nueva cantidad");
        int nCantidadP = modificarP.nextInt();
        producto.setCantidad(nCantidadP);

        System.out.println("Ingrese nueva descripcion");
        String nDescripcionP = modificarP.nextLine();
        producto.setNombre(nDescripcionP);
    }
    
    private static void eliminarProducto(int id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                productos.remove(i);
                break;
            }
        }
    }
}
