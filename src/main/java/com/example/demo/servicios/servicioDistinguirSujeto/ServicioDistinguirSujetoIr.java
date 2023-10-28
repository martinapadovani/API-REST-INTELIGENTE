package com.example.demo.servicios.servicioDistinguirSujeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositorios.RepositorioIr;
import com.example.demo.servicios.servicioConjugacion.ServicioConjugacionIr;

@Service
public class ServicioDistinguirSujetoIr {
    
    @Autowired
    ServicioConjugacionIr servicioConjugacionIr;

    @Autowired
    RepositorioIr repositorioIr;

    public String distinguirSujetoIr(String sujeto, String verboInfinitivo){

        String raiz = verboInfinitivo.substring(0, verboInfinitivo.length() - 2);
        String conjugacion = null;

        switch (sujeto) {

            case "primeraPersonaS":

                conjugacion = repositorioIr.findPrimeraPersonaSByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                  // Si la conjugación se encontró en la base de datos, la retorno 
                  return conjugacion;
                }else{
                    //Si no se encontro, la calculo.
                    conjugacion = servicioConjugacionIr.conjugacionPrimeraPersonaS(raiz, verboInfinitivo);
                }

            break;

            case "segundaPersonaS":

                conjugacion = repositorioIr.findPrimeraSegundaSByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                   conjugacion = servicioConjugacionIr.conjugacionSegundaPersonaS(raiz, verboInfinitivo);
                }

            break;

            case "terceraPersonaS":

                conjugacion = repositorioIr.findPrimeraTerceraSByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                 }else{
                    conjugacion = servicioConjugacionIr.conjugacionTerceraPersonaS(raiz, verboInfinitivo);
                }

            break;

            case "primeraPersonaP":

                conjugacion = repositorioIr.findPrimeraPersonaPByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                    conjugacion = servicioConjugacionIr.conjugacionPrimeraPersonaP(raiz, verboInfinitivo);
                }

            break;

            case "segundaPersonaP":

                conjugacion = repositorioIr.findPrimeraSegundaPByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                    conjugacion = servicioConjugacionIr.conjugacionSegundaPersonaP(raiz, verboInfinitivo);
                }

            break;
            
            case "terceraPersonaP":

                conjugacion = repositorioIr.findPrimeraTerceraPByVerboInfinitivo(verboInfinitivo);
                if (conjugacion != null) {
                   // Si la conjugación se encontró en la base de datos, al retorno 
                   return conjugacion;
                }else{
                    conjugacion = servicioConjugacionIr.conjugacionTerceraPersonaP(raiz, verboInfinitivo);
                }
            break;
        
            default:
            break;
        }

        return conjugacion;
    }
}
