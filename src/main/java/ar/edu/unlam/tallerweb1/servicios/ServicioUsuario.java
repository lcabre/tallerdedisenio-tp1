package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

import java.util.List;

// Interface que define los metodos del Servicio de Usuarios.
public interface ServicioUsuario {

	Void guardar(Usuario usuario);

	List<Usuario> listarSexo(String sexo);
}
