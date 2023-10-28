package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Verbo;
import com.example.demo.servicios.Servicio;
@RestController
@RequestMapping("/conjugar")
public class Controlador {

    @Autowired
    Servicio servicio;

    @GetMapping("/sujeto/{verbo}/{sujeto}")
    public String conjugarSujeto(@PathVariable("verbo") String verbo, @PathVariable("sujeto") String sujeto ){

        return servicio.conjugarSujeto(verbo, sujeto);
    }

    @GetMapping("/todos/{verbo}")
    public Verbo conjugarTodos(@PathVariable("verbo") String verbo){

        return servicio.conjugarTodos(verbo);
    }
    
}
