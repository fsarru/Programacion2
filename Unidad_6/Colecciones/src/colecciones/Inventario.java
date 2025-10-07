package colecciones;

import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        if (buscarProductoPorId(p.getId()) == null) {
            productos.add(p);
            System.out.println("Producto correctamente agregado: " + p.getNombre());
        } else {
            System.out.println("Ya existe un producto con el ID " + p.getId());
        }
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El listado está vacío.");
            return;
        }
        System.out.println("El listado cuenta con " + productos.size() + " productos en total");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }

    }

public Producto buscarProductoPorId(String id) {
    int ubicacion = 0;
    for (Producto producto : productos) {
        if (producto.getId().equals(id)) {
            System.out.println("Producto encontrado ");
            return producto;
        }
        ubicacion++;
    }
    System.out.println("Producto con ID " + id + " no encontrado en el inventario.");
    return null;
}


    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Fue eliminado el producto '" + p.getNombre() + "' con ID " + id);
        } else {
            System.out.println("No se encontró un producto con el ID " + id + " . No se pudo eliminar.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Se actualizo el stock para " + p.getNombre() + ". Nuevo Stock: " + nuevaCantidad);
        } else {
            System.out.println("No se encontró un producto con el ID " + id + ".");
        }
    }

public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();        
        System.out.println("Productos por categoria: " + categoria.name());
            for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                filtrados.add(producto);
                System.out.println(producto.getNombre()); 
            }
        }       
        System.out.println("Total de productos de " + categoria.name() + " encontrados: " + filtrados.size());
        
        return filtrados;
    }



    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if(p.getCantidad()> mayorStock.getCantidad()){
                mayorStock = p;
               
            }            
        }
         return mayorStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                filtrados.add(producto);
            }
        }
        return filtrados;
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("  - " + categoria.name() + ": " + categoria.getDescripcion());
        }
    }
}