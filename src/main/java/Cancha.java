import javax.persistence.*;

@Entity
@Table(name = "CANCHAS")
public class Cancha {
    @Id
    private Long codigoCancha;

    private String nombre;
    private Boolean estaIluminado;

    @ManyToOne
    private Color codigoColor;

    public Long getCodigoCancha() {
        return codigoCancha;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getEstaIluminado() {
        return estaIluminado;
    }

    public Color getCodigoColor() {
        return codigoColor;
    }

    public void setEstaIluminado(Boolean estaIluminado) {
        this.estaIluminado = estaIluminado;
    }

    public void setCodigoColor(Color codigoColor) {
        this.codigoColor = codigoColor;
    }
}
