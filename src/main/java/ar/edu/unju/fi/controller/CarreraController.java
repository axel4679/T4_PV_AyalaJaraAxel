package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.fi.model.Carrera; // Asegúrate de tener la importación correcta del modelo Carrera

@Controller
public class CarreraController {

    @GetMapping("/formularioCarrera")
    public ModelAndView getFormCarrera() {
        ModelAndView modelAndView = new ModelAndView("formularioCarrera");
        modelAndView.addObject("carrera", new Carrera(null, null, 0, null));
        return modelAndView;
    }
}

