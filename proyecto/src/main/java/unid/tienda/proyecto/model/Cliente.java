package unid.tienda.proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private long id;
    private String nombre;
    private Boolean personaFisOMor;
    private String razonSocial;
    private String RFC;
    private String Domicilio;
    private String tipoActividad;
    private String CP;
    private String ciudad;

    private Boolean admin;

}
