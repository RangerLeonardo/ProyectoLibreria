package unid.tienda.proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private long id;
    private String nombre;
    private String Autor;
    private String ISBN;
    private String Editorial;
    private String Pais;
    private String paginas;
    private String sinopsis;
    private Date fechaPublicacion;
    private String idioma;
    private String precio;
    private int cantidad;
}
