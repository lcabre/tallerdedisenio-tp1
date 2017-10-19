package ar.edu.unlam.tallerweb1;

import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UsuarioTest extends SpringTest{

    @Inject
    private UsuarioDao usuarioDao;//no funciona preguntar que esta pasando.

    @Test
    @Transactional // de transacciones de db, por si hay errores etc.
    @Rollback() // luego del test borra el insert
    public void testUsuario(){
        Usuario user = new Usuario();
        user.setEmail("leocab16@gmail.com");
        user.setPassword("123123");
        user.setRol("admin");
        getSession().save(user);
        Long id = user.getId();
        Usuario user2 = getSession().get(Usuario.class,id);
        assertThat(user2).isNotNull();
    }

    public void testQueEncuentreUsuariosPorSexo(){

        Usuario user1 = new Usuario();
        user1.setSexo("F");
        Usuario user2 = new Usuario();
        user1.setSexo("F");
        Usuario user3 = new Usuario();
        user1.setSexo("M");
        Usuario user4 = new Usuario();
        user1.setSexo("F");

        getSession().save(user1);
        getSession().save(user2);
        getSession().save(user3);
        getSession().save(user4);


        List<Usuario> usuarios = usuarioDao.listarSexo("f")
    }
}