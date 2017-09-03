package ar.edu.unlam.tp1.modelo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Comuna {

    @Id
    @GeneratedValue()
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "comuna", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Barrio> barrios = new ArrayList<>();

    public Comuna(String nombre){
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

    public List<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(ArrayList<Barrio> barrios) {
        this.barrios = barrios;
    }

    public void addBarrio(Barrio barrio){
        this.barrios.add(barrio);
    }
}
