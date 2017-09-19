package ar.edu.unlam.tp1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerOperacion {

    @RequestMapping("/operacion/{operacion}/{numero1}/{numero2}")
    public ModelAndView operacion(@PathVariable Integer numero1, @PathVariable Integer numero2, @PathVariable String operacion){

        ModelMap modelo = new ModelMap();
        Float resultado = 0f;

        try{
            switch (operacion){
                case "suma":
                    resultado = (float)(numero1 + numero2);
                    break;
                case "resta":
                    resultado = (float)(numero1 - numero2);
                    break;
                case "multiplicacion":
                    resultado = (float)(numero1 * numero2);
                    break;
                case "division":
                    resultado = (float)numero1 / (float)numero2;
                    break;
                default:
                    modelo.put("error","hubo un error");
                    return new ModelAndView("tp1/error", modelo);
            }
            modelo.put("n1",numero1);
            modelo.put("n2",numero2);
            modelo.put("operacion",operacion);
            modelo.put("resultado",resultado);
        }catch (Exception e){
            modelo.put("error",e.getMessage());
            return new ModelAndView("tp1/error", modelo);
        }
        return new ModelAndView("tp1/resultado", modelo);
    }
}
