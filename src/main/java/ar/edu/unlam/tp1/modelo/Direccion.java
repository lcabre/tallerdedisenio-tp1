package ar.edu.unlam.tp1.modelo;

import javax.persistence.*;

@Entity
public class Direccion {

    @Id
    @GeneratedValue()
    private Long id;
    private String calle;
    private String numero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_barrio")
    private Barrio barrio;

    public Direccion(){}

    public Direccion(String calle, String numero, Barrio barrio){
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }
}
