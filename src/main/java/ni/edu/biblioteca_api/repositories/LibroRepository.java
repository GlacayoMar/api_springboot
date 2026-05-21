package ni.edu.biblioteca_api.repositories;

import ni.edu.biblioteca_api.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro,Long> {
    List<Libro> findByTituloContainingIgnoreCase(String titulo);

    List<Libro> findByDisponibleTrue();
}
