package ni.edu.biblioteca_api.services;

import ni.edu.biblioteca_api.models.Libro;
import ni.edu.biblioteca_api.repositories.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    public Optional<Libro> getLibroById(Long id) {
        return libroRepository.findById(id);
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro updateLibro(Long id, Libro libroActualizado) {
        return libroRepository.findById(id)
                .map(libro -> {
                    libro.setTitulo(libroActualizado.getTitulo());
                    libro.setGenero(libroActualizado.getGenero());
                    libro.setAnioPublicacion(libroActualizado.getAnioPublicacion());
                    return libroRepository.save(libro);
                }).orElseThrow(() -> new RuntimeException("Libro no encontrado"));
    }

    public void deleteLibro(Long id) {
        libroRepository.deleteById(id);
    }
}
