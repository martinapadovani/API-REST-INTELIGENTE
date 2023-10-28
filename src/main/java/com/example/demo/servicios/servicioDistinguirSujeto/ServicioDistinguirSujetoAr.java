package com.example.demo.servicios.servicioDistinguirSujeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositorios.RepositorioAr;
import com.example.demo.servicios.servicioConjugacion.ServicioConjugacionAr;

@Service
public class ServicioDistinguirSujetoAr {

    @Autowired
    ServicioConjugacionAr servicioConjugacionAr;

    @Autowired
    RepositorioAr repositorioAr;

    public String distinguirSujetoAr(String sujeto, String verboInfinitivo){

        String raiz = verboInfinitivo.substring(0, verboInfinitivo.length() - 2);
        String conjugacion = null;

        switch (sujeto) {

            case "primeraPersonaS":

                conjugacion = repositorioAr.findPrimeraPersonaSByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                  // Si la conjugación se encontró en la base de datos, la retorno 
                  return conjugacion;
                }else{
                    //Si no se encontro, la calculo.
                    conjugacion = servicioConjugacionAr.conjugacionPrimeraPersonaS(raiz);
                }

            break;

            case "segundaPersonaS":

                conjugacion = repositorioAr.findPrimeraSegundaSByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                   conjugacion = servicioConjugacionAr.conjugacionSegundaPersonaS(raiz);
                }

            break;

            case "terceraPersonaS":

                conjugacion = repositorioAr.findPrimeraTerceraSByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                 }else{
                    conjugacion = servicioConjugacionAr.conjugacionTerceraPersonaS(raiz);
                }

            break;

            case "primeraPersonaP":

                conjugacion = repositorioAr.findPrimeraPersonaPByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                    conjugacion = servicioConjugacionAr.conjugacionPrimeraPersonaP(raiz);
                }

            break;

            case "segundaPersonaP":

                conjugacion = repositorioAr.findPrimeraSegundaPByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                    conjugacion = servicioConjugacionAr.conjugacionSegundaPersonaP(raiz);
                }

            break;
            
            case "terceraPersonaP":

                conjugacion = repositorioAr.findPrimeraTerceraPByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                    conjugacion = servicioConjugacionAr.conjugacionTerceraPersonaP(raiz);
                }
            break;
        
            default:
            break;
        }

        return conjugacion;
    }
    
}
