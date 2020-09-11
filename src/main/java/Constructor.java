import javax.persistence.*;

@Entity
@Table(name = "CONSTRUCTORES")
public class Constructor {
    @Id
    private Long codigoConstructor;

    @Column(length = 128)
    private String nombre;
    private String apellido;

    @Column(length = 200)
    private String domicilio;

    public Long getCodigoConstructor() {
        return codigoConstructor;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
