package com.example.demo.servicios.servicioDistinguirSujeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositorios.RepositorioEr;
import com.example.demo.servicios.servicioConjugacion.ServicioConjugacionEr;

@Service
public class ServicioDistinguirSujetoEr {

    @Autowired
    ServicioConjugacionEr servicioConjugacionEr;

    @Autowired
    RepositorioEr repositorioEr;

    public String distinguirSujetoEr(String sujeto, String verboInfinitivo){

        String raiz = verboInfinitivo.substring(0, verboInfinitivo.length() - 2);
        String conjugacion = null;

        switch (sujeto) {

            case "primeraPersonaS":

                conjugacion = repositorioEr.findPrimeraPersonaSByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                  // Si la conjugación se encontró en la base de datos, la retorno 
                  return conjugacion;
                }else{
                    //Si no se encontro, la calculo.
                    conjugacion = servicioConjugacionEr.conjugacionPrimeraPersonaS(raiz);
                }

            break;

            case "segundaPersonaS":

                conjugacion = repositorioEr.findPrimeraSegundaSByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                   conjugacion = servicioConjugacionEr.conjugacionSegundaPersonaS(raiz);
                }

            break;

            case "terceraPersonaS":

                conjugacion = repositorioEr.findPrimeraTerceraSByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                 }else{
                    conjugacion = servicioConjugacionEr.conjugacionTerceraPersonaS(raiz);
                }

            break;

            case "primeraPersonaP":

                conjugacion = repositorioEr.findPrimeraPersonaPByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                    conjugacion = servicioConjugacionEr.conjugacionPrimeraPersonaP(raiz);
                }

            break;

            case "segundaPersonaP":

                conjugacion = repositorioEr.findPrimeraSegundaPByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                    conjugacion = servicioConjugacionEr.conjugacionSegundaPersonaP(raiz);
                }

            break;
            
            case "terceraPersonaP":

                conjugacion = repositorioEr.findPrimeraTerceraPByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                    conjugacion = servicioConjugacionEr.conjugacionTerceraPersonaP(raiz);
                }
            break;
        
            default:
            break;
        }

        return conjugacion;
    }
    
}
