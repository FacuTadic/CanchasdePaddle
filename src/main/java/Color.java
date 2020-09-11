import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COLORES")
public class Color {
    @Id
    private Long codigoColor;

    private String descripcion;

    public Long getCodigoColor() {
        return codigoColor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigoColor(Long codigoColor) {
        this.codigoColor = codigoColor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
