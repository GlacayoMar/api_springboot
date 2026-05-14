package ni.edu.biblioteca_api.controllers;

import ni.edu.biblioteca_api.models.Libro;
import ni.edu.biblioteca_api.services.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
@CrossOrigin("*")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping
    public List<Libro> listar() {
        return libroService.getAllLibros();
    }

    @GetMapping("/{id}")
    public Libro obtener(@PathVariable Long id) {
        return libroService.getLibroById(id)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado"));
    }

    @PostMapping
    public Libro crear(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @PutMapping("/{id}")
    public Libro actualizar(@PathVariable Long id,
                            @RequestBody Libro libro) {
        return libroService.updateLibro(id, libro);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        libroService.deleteLibro(id);
    }
}