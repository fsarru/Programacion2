
package colecciones_ej1;


public class Colecciones_EJ1 {

    public static void main(String[] args) {

        // Crear inventario
        Inventario inventario = new Inventario();

        // Tarea 1: Crear y agregar 5 productos
        Producto p1 = new Producto("001", "Leche", 1200.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("002", "Smartphone", 2500.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("003", "Camisa", 1800.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("004", "Sartén", 1500.0, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("005", "Arroz", 900.0, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Tarea 2: Listar todos los productos
        inventario.listarProductos();

        // Tarea 3: Buscar producto por ID
        System.out.println("\nBuscando producto con ID 002:");
        Producto encontrado = inventario.buscarProductoPorId("002");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // Tarea 4: Filtrar por categoría
        System.out.println("\nProductos de la categoría ALIMENTOS:");
        List<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        for (Producto p : alimentos) {
            p.mostrarInfo();
        }

        // Tarea 5: Eliminar producto y listar restantes
        System.out.println("\nEliminando producto con ID 003:");
        inventario.eliminarProducto("003");
        inventario.listarProductos();

        // Tarea 6: Actualizar stock
        System.out.println("\nActualizando stock del producto con ID 001:");
        inventario.actualizarStock("001", 75);

        // Tarea 7: Mostrar total de stock
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        // Tarea 8: Mostrar producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // Tarea 9: Filtrar productos por precio
        System.out.println("\nProductos con precio entre $1000 y $3000:");
        List<Producto> precioFiltrado = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : precioFiltrado) {
            p.mostrarInfo();
        }

        // Tarea 10: Mostrar categorías disponibles
        inventario.mostrarCategoriasDisponibles();
    }
}
   
