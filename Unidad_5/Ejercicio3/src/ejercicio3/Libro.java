
package ejercicio3;

public class Libro {
    private String titulo;
    private int isbn;
    private Editorial editorial;
    private Autor autor;
    
    public Libro(String titulo, int isbn, Editorial editorial, Autor autor){
    this.titulo = titulo;
    this.isbn = isbn;
    this.editorial = editorial;
    this.autor = autor;    
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
   public void mostrarLibro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor.getNombre() + " (Nacionalidad: " + autor.getNacionalidad() + ")");
        System.out.println("Editorial: " + editorial.getNombre() + " (Direccion: " + editorial.getDireccion() + ")");
}
}