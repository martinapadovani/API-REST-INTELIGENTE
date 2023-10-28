package com.example.demo.servicios.ServicioConjugacionTodos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.VerboIr;
import com.example.demo.servicios.servicioConjugacion.ServicioConjugacionIr;

@Service
public class ServicioConjugacionTodosIr {

    @Autowired
    ServicioConjugacionIr servicioConjugacionIr;

    public VerboIr obtenerConjugaciones(String verboInfinitivo){

        String raiz = verboInfinitivo.substring(0, verboInfinitivo.length() - 2);
        VerboIr verboConjugado = new VerboIr();
        verboConjugado.setVerboInfinitivo(verboInfinitivo);

        String  conjugacionPrimeraPersonaP = servicioConjugacionIr.conjugacionPrimeraPersonaP(raiz, verboInfinitivo);
        verboConjugado.setPrimeraPersonaP(conjugacionPrimeraPersonaP);

        String conjugacionPrimeraPersonaS = servicioConjugacionIr.conjugacionPrimeraPersonaS(raiz, verboInfinitivo);
        verboConjugado.setPrimeraPersonaS(conjugacionPrimeraPersonaS);

        String conjugacionSegundaPersonaP = servicioConjugacionIr.conjugacionSegundaPersonaP(raiz, verboInfinitivo);
        verboConjugado.setSegundaPersonaP(conjugacionSegundaPersonaP);

        String conjugacionSegundaPersonaS = servicioConjugacionIr.conjugacionSegundaPersonaS(raiz, verboInfinitivo); 
        verboConjugado.setSegundaPersonaS(conjugacionSegundaPersonaS);

        String conjugacionTerceraPersonaP = servicioConjugacionIr.conjugacionTerceraPersonaP(raiz, verboInfinitivo);
        verboConjugado.setTerceraPersonaP(conjugacionTerceraPersonaP);

        String conjugacionTerceraPersonaS = servicioConjugacionIr.conjugacionTerceraPersonaS(raiz, verboInfinitivo);
        verboConjugado.setTerceraPersonaS(conjugacionTerceraPersonaS);

        return verboConjugado;

    }
    
}
