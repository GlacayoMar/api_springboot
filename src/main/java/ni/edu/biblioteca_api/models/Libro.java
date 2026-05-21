package ni.edu.biblioteca_api.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "libros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Long id;

    @Column(
            name = "titulo_libro",
            nullable = false,
            length = 150
    )

    private String titulo;

    @Column(
            name = "genero_libro",
            nullable = false,
            length = 80
    )
    private String genero;

    @Column(
            name = "anio_publicacion",
            nullable = false
    )
    private Integer anioPublicacion;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Column(name = "disponible", nullable = false)
    private Boolean disponible = true;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "id_autor",
            nullable = false
    )
    @JsonBackReference
    private Autor autor;

    @PrePersist
    public void prePersist() {
        fechaCreacion = LocalDateTime.now();
    }
}
