import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PARTIDOS")
public class Partido {
    @Id
    @GeneratedValue
    private Long idPartido;

    private Date inicioPartido;
    private Date finPartido;

    @ManyToOne
    private Cancha codigoCancha;
    @ManyToOne
    private Color codigoColorCancha;
    @ManyToOne
    private Jugador idJugadorResponsable;

    public Long getIdPartido() {
        return idPartido;
    }

    public Date getInicioPartido() {
        return inicioPartido;
    }

    public Date getFinPartido() {
        return finPartido;
    }

    public Cancha getCodigoCancha() {
        return codigoCancha;
    }

    public Color getCodigoColorCancha() {
        return codigoColorCancha;
    }

    public Jugador getIdJugadorResponsable() {
        return idJugadorResponsable;
    }

    public void setInicioPartido(Date inicioPartido) {
        this.inicioPartido = inicioPartido;
    }

    public void setFinPartido(Date finPartido) {
        this.finPartido = finPartido;
    }

    public void setCodigoCancha(Cancha codigoCancha) {
        this.codigoCancha = codigoCancha;
    }

    public void setCodigoColorCancha(Color codigoColorCancha) {
        this.codigoColorCancha = codigoColorCancha;
    }

    public void setIdJugadorResponsable(Jugador idJugadorResponsable) {
        this.idJugadorResponsable = idJugadorResponsable;
    }
}
