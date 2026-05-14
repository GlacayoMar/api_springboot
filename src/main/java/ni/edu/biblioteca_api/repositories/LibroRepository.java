package ni.edu.biblioteca_api.repositories;

import ni.edu.biblioteca_api.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro,Long> {
}
