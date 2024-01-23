
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "roles_permisos")
public class RolPermiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rolId;

    @ManyToOne
    @JoinColumn(name = "modulo_id")
    private ModuloCarpeta moduloId;

    @ManyToOne
    @JoinColumn(name = "formulario_id")
    private FormularioVista formularioId;

    @Column(name = "permiso_modulo")
    private boolean permisoModulo;

    @Column(name = "permiso_formulario")
    private boolean permisoFormulario;
}
