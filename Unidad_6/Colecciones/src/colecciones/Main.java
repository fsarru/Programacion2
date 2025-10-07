package colecciones; 
import java.util.ArrayList; 


public class Main { 
    
    // Método de inicio
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

//tarea 1:
        System.out.println("Tarea 1: ");
        inventario.agregarProducto(new Producto("A001", "Manzanas", 150.50, 150, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("E001", "Celular Smartphone", 8500.99, 45, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("R001", "Remera", 2200.00, 70, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("H001", "Toallas", 1850.75, 90, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("E002", "Auriculares", 1250.00, 120, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("A002", "Leche", 80.00, 200, CategoriaProducto.ALIMENTOS));
        System.out.println("---------- \n"); 

//tarea 2:
        System.out.println("Tarea 2: ");
        inventario.listarProductos();
        System.out.println("---------- \n"); 

//tarea 3:
        System.out.println("Tarea 3: ");
        Producto prodBuscado = inventario.buscarProductoPorId("E001");
        System.out.println("---------- \n"); 

//tarea 4:
        System.out.println("Tarea 4: ");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA); 
        System.out.println("---------- \n"); 

//tarea 5:
        System.out.println("Tarea 5: ");
        inventario.eliminarProducto("E002");
        inventario.listarProductos();
        System.out.println("---------- \n"); 
        
//tarea 6:
        System.out.println("Tarea 6: ");
        inventario.actualizarStock("A001", 300);    
        System.out.println("---------- \n"); 
        
//tarea 7:
        System.out.println("Tarea 7: ");
        System.out.println(" Stock Total del Inventario: " + inventario.obtenerTotalStock() + " unidades.");
        System.out.println("---------- \n"); 
        
//tarea 8:
        System.out.println("Tarea 8: ");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        mayorStock.mostrarInfo();
        System.out.println("---------- \n"); 

//tarea 9:
        System.out.println("Tarea 9: ");
        ArrayList<Producto> preciosMedios = inventario.filtrarProductosPorPrecio(1000.00, 3000.00);
        System.out.println("Productos en rango de precio (" + preciosMedios.size() + " encontrados):");
        System.out.println("---------- \n"); 

//tarea 10: 
        System.out.println("Tarea 10: ");
        inventario.mostrarCategoriasDisponibles();
        System.out.println("---------- \n"); 
    }
}

