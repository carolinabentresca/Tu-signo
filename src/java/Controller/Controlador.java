/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author EXO
 */
@Controller
public class Controlador {

    ModelAndView mv = new ModelAndView();

    @RequestMapping(value = "index.htm", method = RequestMethod.GET)
    public ModelAndView getIndex() {
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "menu.htm", method = RequestMethod.GET)
    public ModelAndView getMenu() {
        mv.setViewName("menu");
        return mv;
    }

    @RequestMapping(value = "aries.htm", method = RequestMethod.GET)
    public ModelAndView getAries() {
        mv.setViewName("aries");
        return mv;
    }

    @RequestMapping(value = "tauro.htm", method = RequestMethod.GET)
    public ModelAndView getTauro() {
        mv.setViewName("tauro");
        return mv;
    }

    @RequestMapping(value = "geminis.htm", method = RequestMethod.GET)
    public ModelAndView getGéminis() {
        mv.setViewName("geminis");
        return mv;
    }

    @RequestMapping(value = "cancer.htm", method = RequestMethod.GET)
    public ModelAndView getCáncer() {
        mv.setViewName("cancer");
        return mv;
    }

    @RequestMapping(value = "leo.htm", method = RequestMethod.GET)
    public ModelAndView getLeo() {
        mv.setViewName("leo");
        return mv;
    }

    @RequestMapping(value = "virgo.htm", method = RequestMethod.GET)
    public ModelAndView getVirgo() {
        mv.setViewName("virgo");
        return mv;
    }

    @RequestMapping(value = "libra.htm", method = RequestMethod.GET)
    public ModelAndView getLibra() {
        mv.setViewName("libra");
        return mv;
    }

    @RequestMapping(value = "escorpio.htm", method = RequestMethod.GET)
    public ModelAndView getEscorpio() {
        mv.setViewName("escorpio");
        return mv;
    }

    @RequestMapping(value = "sagitario.htm", method = RequestMethod.GET)
    public ModelAndView getSagitario() {
        mv.setViewName("sagitario");
        return mv;
    }

    @RequestMapping(value = "capricornio.htm", method = RequestMethod.GET)
    public ModelAndView getCapricornio() {
        mv.setViewName("capricornio");
        return mv;
    }

    @RequestMapping(value = "acuario.htm", method = RequestMethod.GET)
    public ModelAndView getAcuario() {
        mv.setViewName("acuario");
        return mv;
    }

    @RequestMapping(value = "piscis.htm", method = RequestMethod.GET)
    public ModelAndView getPiscis() {
        mv.setViewName("piscis");
        return mv;
    }

    @RequestMapping(value = "index.htm", method = RequestMethod.POST)
    public ModelAndView getValidar(HttpServletRequest request, HttpServletResponse response) {
        String respuesta = request.getParameter("respuesta");

        try {
            if (respuesta.equals(" ") || respuesta.equals("no")) {
                mv.setViewName("index");
            } else {
                mv.setViewName("menu");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return mv;

    }

}
