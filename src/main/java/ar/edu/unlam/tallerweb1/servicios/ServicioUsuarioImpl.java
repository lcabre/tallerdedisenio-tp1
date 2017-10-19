package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service("servicioUsuario")
public class ServicioUsuarioImpl implements ServicioUsuario {
    @Inject
    private UsuarioDao usuarioDao;

    @Override
    public Void guardar(Usuario usuario) {
        return null;
    }

    @Override
    public List<Usuario> listarSexo(String sexo) {
        return this.usuarioDao.listarSexo(sexo);
    }
}
