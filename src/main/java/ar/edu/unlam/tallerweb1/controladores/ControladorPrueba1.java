package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
