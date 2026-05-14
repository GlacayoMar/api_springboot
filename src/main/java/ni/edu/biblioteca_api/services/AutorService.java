package ni.edu.biblioteca_api.services;

import ni.edu.biblioteca_api.models.Autor;
import ni.edu.biblioteca_api.repositories.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> getAllAutores() {
        return autorRepository.findAll();
    }

    public Optional<Autor> getAutorById(Long id) {
        return autorRepository.findById(id);
    }

    public Autor saveAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor updateAutor(Long id, Autor autorActualizado) {
        return autorRepository.findById(id)
                .map(autor -> {
                    autor.setNombre(autorActualizado.getNombre());
                    autor.setNacionalidad(autorActualizado.getNacionalidad());
                    return autorRepository.save(autor);
                }).orElseThrow(() -> new RuntimeException("Autor no encontrado"));
    }

    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
