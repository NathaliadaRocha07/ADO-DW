package com.teste.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Exemplo")

public class ExemploController {

    @GetMapping("/exemplo-view-obj")

    public ModelAndView exemploViewObj() {
        ModelAndView mv = new ModelAndView("mensagem-view.html");
        mv.addObject("Nome", "Nathalia Da Rocha Santos");
        mv.addObject("Email", "nathaliadarochasantos@gmail.com");
        mv.addObject("DataNasc", "Data de nascimento: 29/07/2002");
        mv.addObject("Github", "Github: https://github.com/NathaliadaRocha07");
        mv.addObject("Tel", "11998017755");
        mv.addObject("Linkedin", "Linkedin: https://www.linkedin.com/in/nathalia-da-rocha-santos-19a052237/");
        mv.addObject("Curso", "Graduação em Análise e Desenvolvimento de Sistemas");
        mv.addObject("Habilidade", "Java, HTML, CSS, JS, MySQL");
        return mv;
    }
}
