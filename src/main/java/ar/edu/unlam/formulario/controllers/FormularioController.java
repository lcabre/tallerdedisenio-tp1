package ar.edu.unlam.formulario.controllers;

import ar.edu.unlam.formulario.modelo.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormularioController {

    @RequestMapping("/usuario/add")
    public ModelAndView save(){
        ModelMap model = new ModelMap();
        Persona persona = new Persona();
        model.put("persona",persona);
        return new ModelAndView("formulario/form_persona", model);
    }

    @RequestMapping(value = "/usuario/store", method = RequestMethod.POST)
    public ModelAndView store(@ModelAttribute("persona") Persona persona){
        ModelMap model = new ModelMap();
        model.put("nombre", persona.getNombre());
        model.put("apellido", persona.getApellido());
        model.put("email", persona.getEmail());

        return new ModelAndView("formulario/persona", model);
    }
}
