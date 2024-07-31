import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro("1984", "George Orwell", "Secker & Warburg", 1949, 328);
        Libro libro2 = new Libro("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960, 281);

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan", "Pérez", "juan.perez@email.com", "12345");
        Usuario usuario2 = new Usuario("Ana", "Gómez", "ana.gomez@email.com", "67890");

        // Registrar usuarios
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Realizar préstamos
        biblioteca.realizarPrestamo(libro1, usuario1, new Date(), null);
        biblioteca.realizarPrestamo(libro2, usuario2, new Date(), null);

        // Listar libros
        System.out.println("Libros en la biblioteca:");
        biblioteca.listarLibros();

        // Consultar préstamos activos
        System.out.println("\nPréstamos activos:");
        biblioteca.consultarPrestamosActivos();

        // Devolver libro
        biblioteca.devolverLibro(libro1);

        // Generar informe de préstamos
        System.out.println("\nInforme de préstamos:");
        biblioteca.generarInformePrestamos();
    }
}
