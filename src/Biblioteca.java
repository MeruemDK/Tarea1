import java.util.*;

public class Biblioteca {
    private List<Libro> libros;
    private Map<String, Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new HashMap<>();
        prestamos = new ArrayList<>();
    }

    // Gestión de Libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    // Gestión de Usuarios
    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNumeroIdentificacion(), usuario);
    }

    public void actualizarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNumeroIdentificacion(), usuario);
    }

    public Usuario consultarUsuario(String numeroIdentificacion) {
        return usuarios.get(numeroIdentificacion);
    }

    // Gestión de Préstamos
    public void realizarPrestamo(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
        Prestamo prestamo = new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion);
        prestamos.add(prestamo);
    }

    public void devolverLibro(Libro libro) {
        prestamos.removeIf(prestamo -> prestamo.getLibro().equals(libro) && prestamo.getFechaDevolucion() == null);
    }

    public void consultarPrestamosActivos() {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getFechaDevolucion() == null) {
                System.out.println(prestamo);
            }
        }
    }

    public void generarInformePrestamos() {
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}
