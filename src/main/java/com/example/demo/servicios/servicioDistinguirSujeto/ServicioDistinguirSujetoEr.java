package com.example.demo.servicios.servicioDistinguirSujeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.servicios.servicioConjugacion.ServicioConjugacionEr;

@Service
public class ServicioDistinguirSujetoEr {

    @Autowired
    ServicioConjugacionEr servicioConjugacionEr;

    public void distinguirSujetoEr(String sujeto, String verboInfinitivo){

        String raiz = verboInfinitivo.substring(0, verboInfinitivo.length() - 2);

        switch (sujeto) {
            case "primeraPersonaS":
                servicioConjugacionEr.conjugacionPrimeraPersonaS(raiz);
            break;

            case "segundaPersonaS":
                servicioConjugacionEr.conjugacionSegundaPersonaS(raiz);
            break;

            case "terceraPersonaS":
                servicioConjugacionEr.conjugacionTerceraPersonaS(raiz);
            break;

            case "primeraPersonaP":
                servicioConjugacionEr.conjugacionPrimeraPersonaP(raiz);
            break;

            case "segundaPersonaP":
                servicioConjugacionEr.conjugacionSegundaPersonaP(raiz);
            break;
            
            case "terceraPersonaP":
                servicioConjugacionEr.conjugacionTerceraPersonaP(raiz);
            break;
        
            default:
            break;
        }
    }
    
}
