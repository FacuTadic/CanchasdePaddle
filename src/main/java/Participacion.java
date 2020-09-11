import javax.persistence.*;

@Entity
@Table(name = "JUGADORES")
public class Participacion {
    @Id
    @ManyToOne
    private Jugador idJugador;

    @Id
    @ManyToOne
    private Partido idPartido;

    @ManyToOne
    private Paleta codigoPaleta;

}
