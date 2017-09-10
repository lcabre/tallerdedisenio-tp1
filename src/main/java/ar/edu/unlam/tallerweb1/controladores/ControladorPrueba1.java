package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorPrueba1 {

    @RequestMapping("/miprimer-ejemplo")
    public ModelAndView miPrimerEjemplo(){

        ModelMap modelo = new ModelMap();
        String nombre = "Seba";
        modelo.put("nombre", nombre);

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        modelo.put("lista",lista);
        return new ModelAndView("miprimerejemplo", modelo);
        
        
   
    }
    
    
    @RequestMapping("/prueba-usuario")
    public ModelAndView pruebaDeUsuario(){

        ModelMap modelo1 = new ModelMap();
        
        Usuario uno = new Usuario();
        uno.setEmail("erika@gmail.com");
        uno.setPassword("ope920");
        uno.setRol("madre");
        
        Usuario dos = new Usuario();
        dos.setEmail("leo@gmail.com");
        dos.setPassword("moni920");
        dos.setRol("nieto");
        
        Usuario tres = new Usuario();
        tres.setEmail("pablo@gmail.com");
        tres.setPassword("adm920");
        tres.setRol("abuelo");
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(uno);
        usuarios.add(dos);
        usuarios.add(tres);
        
        modelo1.put("usuarios", usuarios);
        return new ModelAndView("pruebadeusuario", modelo1);
    }
    
}
