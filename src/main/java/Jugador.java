import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "JUGADORES")
public class Jugador {
    @Id
    @GeneratedValue
    private Long idJugador;

    @Column(length = 128)
    private String nombre;
    private String apellido;

    @Column(length = 200)
    private String domicilio;

    private Date nacimiento;

    @OneToOne
    private Paleta idPaleta;

    public Long getIdJugador() {
        return idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public Paleta getIdPaleta() {
        return idPaleta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setIdPaleta(Paleta idPaleta) {
        this.idPaleta = idPaleta;
    }
}
