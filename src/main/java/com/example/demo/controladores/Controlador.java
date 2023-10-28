package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entidades.VerboAr;

import com.example.demo.servicios.Servicio;

@RestController
@RequestMapping("/")
public class Controlador {

    @Autowired
    Servicio servicio;

    @GetMapping("/conjugar/{verbo}")
    public void conjugar(@PathVariable("verbo") VerboAr verbo ){

    }
    
}
