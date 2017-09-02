package ar.edu.unlam.tallerweb1;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.assertThat;

public class UsuarioTest extends SpringTest{

    @Test
    @Transactional // de transacciones de db, por si hay errores etc.
    //@Rollback() // luego del test borra el insert
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
}