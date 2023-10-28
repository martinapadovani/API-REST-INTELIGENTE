package com.example.demo.servicios.ServicioConjugacionTodos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.VerboEr;
import com.example.demo.servicios.servicioConjugacion.ServicioConjugacionEr;

@Service
public class ServicioConjugacionTodosEr {

    @Autowired
    ServicioConjugacionEr servicioConjugacionEr;

    public VerboEr obtenerConjugaciones(String verboInfinitivo){

        String raiz = verboInfinitivo.substring(0, verboInfinitivo.length() - 2);
        VerboEr verboConjugado = new VerboEr();
        verboConjugado.setVerboInfinitivo(verboInfinitivo);
        
        String  conjugacionPrimeraPersonaP = servicioConjugacionEr.conjugacionPrimeraPersonaP(raiz, verboInfinitivo);
        verboConjugado.setPrimeraPersonaP(conjugacionPrimeraPersonaP);

        String conjugacionPrimeraPersonaS = servicioConjugacionEr.conjugacionPrimeraPersonaS(raiz, verboInfinitivo);
        verboConjugado.setPrimeraPersonaS(conjugacionPrimeraPersonaS);

        String conjugacionSegundaPersonaP = servicioConjugacionEr.conjugacionSegundaPersonaP(raiz, verboInfinitivo);
        verboConjugado.setSegundaPersonaP(conjugacionSegundaPersonaP);

        String conjugacionSegundaPersonaS = servicioConjugacionEr.conjugacionSegundaPersonaS(raiz, verboInfinitivo); 
        verboConjugado.setSegundaPersonaS(conjugacionSegundaPersonaS);

        String conjugacionTerceraPersonaP = servicioConjugacionEr.conjugacionTerceraPersonaP(raiz, verboInfinitivo);
        verboConjugado.setTerceraPersonaP(conjugacionTerceraPersonaP);

        String conjugacionTerceraPersonaS = servicioConjugacionEr.conjugacionTerceraPersonaS(raiz, verboInfinitivo);
        verboConjugado.setTerceraPersonaS(conjugacionTerceraPersonaS);

        return verboConjugado;

    }
    
}
