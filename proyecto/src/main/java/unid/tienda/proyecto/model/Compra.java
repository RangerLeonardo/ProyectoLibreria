package unid.tienda.proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "compras")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compra {
    private long id;
    private Cliente clienteId;
    private Book bookId;
    private Date fechaCompra;
    private int cantidad;
    private String precio;
    private int total;
    private int iva;
    private boolean factura;

}
