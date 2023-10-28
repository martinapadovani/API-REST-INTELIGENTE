package com.example.demo.servicios.ServicioConjugacionTodos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.VerboAr;
import com.example.demo.servicios.servicioConjugacion.ServicioConjugacionAr;

@Service
public class ServicioConjugacionTodosAr{

    @Autowired
    ServicioConjugacionAr servicioConjugacionAr;

    public VerboAr obtenerConjugaciones(String verboInfinitivo){
        
        String raiz = verboInfinitivo.substring(0, verboInfinitivo.length() - 2);
        VerboAr verboConjugado = new VerboAr();
        verboConjugado.setVerboInfinitivo(verboInfinitivo);

        String  conjugacionPrimeraPersonaP = servicioConjugacionAr.conjugacionPrimeraPersonaP(raiz, verboInfinitivo);
        verboConjugado.setPrimeraPersonaP(conjugacionPrimeraPersonaP);

        String conjugacionPrimeraPersonaS = servicioConjugacionAr.conjugacionPrimeraPersonaS(raiz, verboInfinitivo);
        verboConjugado.setPrimeraPersonaS(conjugacionPrimeraPersonaS);

        String conjugacionSegundaPersonaP = servicioConjugacionAr.conjugacionSegundaPersonaP(raiz, verboInfinitivo);
        verboConjugado.setSegundaPersonaP(conjugacionSegundaPersonaP);

        String conjugacionSegundaPersonaS = servicioConjugacionAr.conjugacionSegundaPersonaS(raiz, verboInfinitivo); 
        verboConjugado.setSegundaPersonaS(conjugacionSegundaPersonaS);

        String conjugacionTerceraPersonaP = servicioConjugacionAr.conjugacionTerceraPersonaP(raiz, verboInfinitivo);
        verboConjugado.setTerceraPersonaP(conjugacionTerceraPersonaP);

        String conjugacionTerceraPersonaS = servicioConjugacionAr.conjugacionTerceraPersonaS(raiz, verboInfinitivo);
        verboConjugado.setTerceraPersonaS(conjugacionTerceraPersonaS);

        return verboConjugado;

    }

    
}
