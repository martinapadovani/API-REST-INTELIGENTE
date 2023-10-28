package com.example.demo.servicios.servicioConjugacion;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.VerboAr;
import com.example.demo.interfaz.Conjugaciones;
import com.example.demo.repositorios.RepositorioAr;

@Service
public class ServicioConjugacionAr implements Conjugaciones{

    @Autowired
    RepositorioAr repositorioAr;

    @Override
    public String conjugacionPrimeraPersonaS(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("o");
        Optional<VerboAr> verboDBOptional = repositorioAr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboAr verboDB = verboDBOptional.get();
            verboDB.setPrimeraPersonaS(verboConjugado);
            repositorioAr.save(verboDB);
        }else{
            VerboAr verbo = new VerboAr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setPrimeraPersonaS(verboConjugado);
            repositorioAr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaS(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("as");
         Optional<VerboAr> verboDBOptional = repositorioAr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboAr verboDB = verboDBOptional.get();
            verboDB.setSegundaPersonaS(verboConjugado);
            repositorioAr.save(verboDB);
        }else{
            VerboAr verbo = new VerboAr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setSegundaPersonaS(verboConjugado);
            repositorioAr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaS(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("a");
         Optional<VerboAr> verboDBOptional = repositorioAr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboAr verboDB = verboDBOptional.get();
            verboDB.setTerceraPersonaS(verboConjugado);
            repositorioAr.save(verboDB);
        }else{
            VerboAr verbo = new VerboAr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setTerceraPersonaS(verboConjugado);
            repositorioAr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionPrimeraPersonaP(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("amos");
         Optional<VerboAr> verboDBOptional = repositorioAr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboAr verboDB = verboDBOptional.get();
            verboDB.setPrimeraPersonaP(verboConjugado);
            repositorioAr.save(verboDB);
        }else{
            VerboAr verbo = new VerboAr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setPrimeraPersonaP(verboConjugado);
            repositorioAr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaP(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("an");

         Optional<VerboAr> verboDBOptional = repositorioAr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboAr verboDB = verboDBOptional.get();
            verboDB.setSegundaPersonaP(verboConjugado);
            repositorioAr.save(verboDB);
        }else{
            VerboAr verbo = new VerboAr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setSegundaPersonaP(verboConjugado);
            repositorioAr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaP(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("an");
        
        Optional<VerboAr> verboDBOptional = repositorioAr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboAr verboDB = verboDBOptional.get();
            verboDB.setTerceraPersonaP(verboConjugado);
            repositorioAr.save(verboDB);
        }else{
            VerboAr verbo = new VerboAr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setTerceraPersonaP(verboConjugado);
            repositorioAr.save(verbo);
        }

        return verboConjugado;
    }
    
}
