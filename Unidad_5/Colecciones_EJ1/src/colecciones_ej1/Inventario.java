import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la lista.
     */
    public void agregarProducto(Producto p) {
        if (buscarProductoPorId(p.getId()) == null) {
            productos.add(p);
            System.out.println("✅ Producto agregado: " + p.getNombre());
        } else {
            System.out.println("🚫 Error: Ya existe un producto con el ID " + p.getId());
        }
    }

    /**
     * Muestra la información de todos los productos en el inventario.
     */
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("⚠️ El inventario está vacío.");
            return;
        }
        System.out.println("\n--- LISTADO COMPLETO DE PRODUCTOS (" + productos.size() + " en total) ---");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
        System.out.println("---------------------------------------");
    }

    /**
     * Busca un producto por su ID.
     * @return El Producto encontrado o null si no existe.
     */
    public Producto buscarProductoPorId(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    /**
     * Elimina un producto por su ID.
     */
    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("🗑️ Producto '" + p.getNombre() + "' con ID " + id + " eliminado.");
        } else {
            System.out.println("🚫 Error: No se encontró un producto con el ID " + id + " para eliminar.");
        }
    }

    /**
     * Actualiza la cantidad en stock de un producto.
     */
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("🔄 Stock actualizado para " + p.getNombre() + ". Nuevo Stock: " + nuevaCantidad);
        } else {
            System.out.println("🚫 Error: No se encontró un producto con el ID " + id + ".");
        }
    }

    /**
     * Filtra y retorna los productos que pertenecen a una categoría.
     */
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                filtrados.add(producto);
            }
        }
        return filtrados;
    }

    /**
     * Calcula y retorna la suma total del stock de todos los productos.
     */
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad();
        }
        return total;
    }

    /**
     * Retorna el producto con la mayor cantidad en stock.
     * @return El Producto con mayor stock o null si el inventario está vacío.
     */
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        // Uso de Streams para encontrar el máximo, más eficiente y conciso
        return productos.stream()
                        .max(Comparator.comparingInt(Producto::getCantidad))
                        .orElse(null);
    }

    /**
     * Filtra los productos cuyos precios están dentro del rango [min, max].
     */
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                filtrados.add(producto);
            }
        }
        return filtrados;
    }

    /**
     * Muestra todas las categorías disponibles con sus descripciones.
     */
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORÍAS DE PRODUCTO DISPONIBLES ---");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("  - " + categoria.name() + ": " + categoria.getDescripcion());
        }
        System.out.println("------------------------------------------");
    }
}