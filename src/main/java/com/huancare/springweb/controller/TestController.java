package com.huancare.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = {"/", "pruebas", "test"})
public class TestController {

    @ModelAttribute
    public void listado(Model model) {
        model.addAttribute("nombres", new String[]{"jorge", "jose"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("titulo", "Hola TECSUP");
        model.addAttribute("contenido", "Bienvenidos al curso Spring Framework");
        return "test/index";
    }

    @RequestMapping("informacion")
    public String alternativo() {
        return "test/informacion";
    }

    @RequestMapping(value = {"info", "prueba"})
    public String pruebas() {
        return "test/pruebas";
    }

    @RequestMapping("parametros")
    public String parametros(@RequestParam String nombres,
            @RequestParam(required = false, defaultValue = "") String apellidos,
            Model model) {

        model.addAttribute("nombresCompleto", nombres + " " + apellidos);
        return "test/parametros";
    }
}
