
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "formularios")
public class FormularioVista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;
}