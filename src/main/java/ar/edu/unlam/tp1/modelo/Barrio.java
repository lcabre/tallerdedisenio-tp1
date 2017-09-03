package ar.edu.unlam.tp1.modelo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Barrio {

    @Id
    @GeneratedValue()
    private Long id;
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_comuna")
    private Comuna comuna;

    @OneToMany(mappedBy = "barrio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Direccion> direcciones = new ArrayList<>();

    public Barrio(){}

    public Barrio(String nombre){
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }
}
