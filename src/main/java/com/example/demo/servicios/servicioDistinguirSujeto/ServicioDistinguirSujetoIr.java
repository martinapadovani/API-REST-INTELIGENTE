package com.example.demo.servicios.servicioDistinguirSujeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.servicios.servicioConjugacion.ServicioConjugacionIr;

@Service
public class ServicioDistinguirSujetoIr {
    
    @Autowired
    ServicioConjugacionIr servicioConjugacionIr;

    public void distinguirSujetoIr(String sujeto, String verboInfinitivo){

        String raiz = verboInfinitivo.substring(0, verboInfinitivo.length() - 2);

        switch (sujeto) {
            case "primeraPersonaS":
                servicioConjugacionIr.conjugacionPrimeraPersonaS(raiz);
            break;

            case "segundaPersonaS":
                servicioConjugacionIr.conjugacionSegundaPersonaS(raiz);
            break;

            case "terceraPersonaS":
                servicioConjugacionIr.conjugacionTerceraPersonaS(raiz);
            break;

            case "primeraPersonaP":
                servicioConjugacionIr.conjugacionPrimeraPersonaP(raiz);
            break;

            case "segundaPersonaP":
                servicioConjugacionIr.conjugacionSegundaPersonaP(raiz);
            break;
            
            case "terceraPersonaP":
                servicioConjugacionIr.conjugacionTerceraPersonaP(raiz);
            break;
        
            default:
            break;
        }
    }
}
