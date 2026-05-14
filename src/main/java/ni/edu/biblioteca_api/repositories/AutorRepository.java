package ni.edu.biblioteca_api.repositories;

import ni.edu.biblioteca_api.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Long> {
}
