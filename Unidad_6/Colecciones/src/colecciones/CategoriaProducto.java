
package colecciones;

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos y gadgets"),
    ROPA("Prendas de vestir y accesorios"),
    HOGAR("Artículos para la casa y decoración");

    private final String descripcion;

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}