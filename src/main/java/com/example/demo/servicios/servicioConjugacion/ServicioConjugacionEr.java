package com.example.demo.servicios.servicioConjugacion;

import org.springframework.stereotype.Service;

import com.example.demo.interfaz.Conjugaciones;

@Service
public class ServicioConjugacionEr implements Conjugaciones {

    @Override
    public String conjugacionPrimeraPersonaS(String raiz){
        String verboConjugado = raiz.concat("o");
        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaS(String raiz){
        String verboConjugado = raiz.concat("es");
        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaS(String raiz){
        String verboConjugado = raiz.concat("e");
        return verboConjugado;
    }

    @Override
    public String conjugacionPrimeraPersonaP(String raiz){
        String verboConjugado = raiz.concat("emos");
        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaP(String raiz){
        String verboConjugado = raiz.concat("en");
        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaP(String raiz){
        String verboConjugado = raiz.concat("en");
        return verboConjugado;
    }
    
}
