package ar.edu.unlam.tp1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Farmacia {

    @Id
    @GeneratedValue()
    private Long id;
    private String nombre;
    private String telefono;
    private String diaDeTurno;
    @OneToOne
    private Direccion direccion;
    @OneToOne
    private Punto geolocalizacion;

    public Farmacia(){}

    public Farmacia(String nombre, String diaDeTurno){
        this.nombre = nombre;
        this.diaDeTurno = diaDeTurno;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDiaDeTurno() {
        return diaDeTurno;
    }

    public void setDiaDeTurno(String diaDeTurno) {
        this.diaDeTurno = diaDeTurno;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Punto getGeolocalizacion() {
        return geolocalizacion;
    }

    public void setGeolocalizacion(Punto geolocalizacion) {
        this.geolocalizacion = geolocalizacion;
    }
}
