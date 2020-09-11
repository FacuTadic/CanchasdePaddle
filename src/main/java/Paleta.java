import javax.persistence.*;

@Entity
@Table(name = "PALETAS")
public class Paleta {
    @Id
    private Long codigoPaletas;

    @Column(length = 128)
    private String nombre;

    private Float grosor;

    @ManyToOne
    private Color color;

    @ManyToOne
    private Constructor constructor;

    public Long getCodigoPaletas() {
        return codigoPaletas;
    }

    public String getNombre() {
        return nombre;
    }

    public Float getGrosor() {
        return grosor;
    }

    public Color getColor() {
        return color;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrosor(Float grosor) {
        this.grosor = grosor;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }
}
