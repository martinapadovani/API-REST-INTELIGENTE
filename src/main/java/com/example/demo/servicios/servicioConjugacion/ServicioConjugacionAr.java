package com.example.demo.servicios.servicioConjugacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaz.Conjugaciones;
import com.example.demo.repositorios.RepositorioAr;

@Service
public class ServicioConjugacionAr implements Conjugaciones{

    @Autowired
    RepositorioAr repositorioAr;

    @Override
    public String conjugacionPrimeraPersonaS(String raiz){

        String verboConjugado = raiz.concat("o");
        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaS(String raiz){
        String verboConjugado = raiz.concat("as");
        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaS(String raiz){
        String verboConjugado = raiz.concat("a");
        return verboConjugado;
    }

    @Override
    public String conjugacionPrimeraPersonaP(String raiz){
        String verboConjugado = raiz.concat("amos");
        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaP(String raiz){
        String verboConjugado = raiz.concat("an");
        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaP(String raiz){
        String verboConjugado = raiz.concat("an");
        return verboConjugado;
    }
    
}
