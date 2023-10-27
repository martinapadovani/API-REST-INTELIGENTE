package com.example.demo.servicios.servicioDistinguirSujeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.servicios.servicioConjugacion.ServicioConjugacionAr;

@Service
public class ServicioDistinguirSujetoAr {

    @Autowired
    ServicioConjugacionAr servicioConjugacionAr;

    public void distinguirSujetoAr(String sujeto, String verboInfinitivo){

        String raiz = verboInfinitivo.substring(0, verboInfinitivo.length() - 2);

        switch (sujeto) {
            case "primeraPersonaS":
                servicioConjugacionAr.conjugacionPrimeraPersonaS(raiz);
            break;

            case "segundaPersonaS":
                servicioConjugacionAr.conjugacionSegundaPersonaS(raiz);
            break;

            case "terceraPersonaS":
                servicioConjugacionAr.conjugacionTerceraPersonaS(raiz);
            break;

            case "primeraPersonaP":
                servicioConjugacionAr.conjugacionPrimeraPersonaP(raiz);
            break;

            case "segundaPersonaP":
                servicioConjugacionAr.conjugacionSegundaPersonaP(raiz);
            break;
            
            case "terceraPersonaP":
                servicioConjugacionAr.conjugacionTerceraPersonaP(raiz);
            break;
        
            default:
            break;
        }
    }
    
}
