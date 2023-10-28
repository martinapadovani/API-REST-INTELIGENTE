package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.servicios.Servicio;
@RestController
@RequestMapping("/conjugar")
public class Controlador {

    @Autowired
    Servicio servicio;

    @GetMapping("/{verbo}/{sujeto}")
    public String conjugar(@PathVariable("verbo") String verbo, @PathVariable("sujeto") String sujeto ){

        return servicio.conjugar(verbo, sujeto);
    }
    
}
