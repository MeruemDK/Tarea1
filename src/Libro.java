public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int anoPublicacion;
    private int numPaginas;

    public Libro(String titulo, String autor, String editorial, int anoPublicacion, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anoPublicacion = anoPublicacion;
        this.numPaginas = numPaginas;
    }

    // Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return String.format("Título: %s, Autor: %s, Editorial: %s, Año: %d, Páginas: %d",
                titulo, autor, editorial, anoPublicacion, numPaginas);
    }
}
