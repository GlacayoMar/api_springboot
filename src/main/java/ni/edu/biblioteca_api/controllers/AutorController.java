package ni.edu.biblioteca_api.controllers;

import ni.edu.biblioteca_api.models.Autor;
import ni.edu.biblioteca_api.services.AutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
@CrossOrigin("*")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping
    public List<Autor> listar() {
        return autorService.getAllAutores();
    }

    @GetMapping("/{id}")
    public Autor obtener(@PathVariable Long id) {
        return autorService.getAutorById(id)
                .orElseThrow(() -> new RuntimeException("Autor no encontrado"));
    }

    @PostMapping
    public Autor crear(@RequestBody Autor autor) {
        return autorService.saveAutor(autor);
    }

    @PutMapping("/{id}")
    public Autor actualizar(@PathVariable Long id,
                            @RequestBody Autor autor) {
        return autorService.updateAutor(id, autor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        autorService.deleteAutor(id);
    }
}
