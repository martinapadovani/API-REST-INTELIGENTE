package com.example.demo.servicios.servicioConjugacion;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.VerboAr;
import com.example.demo.entidades.VerboEr;
import com.example.demo.interfaz.Conjugaciones;
import com.example.demo.repositorios.RepositorioEr;

@Service
public class ServicioConjugacionEr implements Conjugaciones {

    @Autowired
    RepositorioEr repositorioEr;

    @Override
    public String conjugacionPrimeraPersonaS(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("o");
        Optional<VerboEr> verboDBOptional = repositorioEr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboEr verboDB = verboDBOptional.get();
            verboDB.setPrimeraPersonaS(verboConjugado);
            repositorioEr.save(verboDB);
        }else{
            VerboEr verbo = new VerboEr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setPrimeraPersonaS(verboConjugado);
            repositorioEr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaS(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("es");
        Optional<VerboEr> verboDBOptional = repositorioEr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboEr verboDB = verboDBOptional.get();
            verboDB.setSegundaPersonaS(verboConjugado);
            repositorioEr.save(verboDB);
        }else{
            VerboEr verbo = new VerboEr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setSegundaPersonaS(verboConjugado);
            repositorioEr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaS(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("e");
        Optional<VerboEr> verboDBOptional = repositorioEr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboEr verboDB = verboDBOptional.get();
            verboDB.setTerceraPersonaS(verboConjugado);
            repositorioEr.save(verboDB);
        }else{
            VerboEr verbo = new VerboEr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setTerceraPersonaS(verboConjugado);
            repositorioEr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionPrimeraPersonaP(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("emos");
        Optional<VerboEr> verboDBOptional = repositorioEr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboEr verboDB = verboDBOptional.get();
            verboDB.setPrimeraPersonaP(verboConjugado);
            repositorioEr.save(verboDB);
        }else{
            VerboEr verbo = new VerboEr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setPrimeraPersonaP(verboConjugado);
            repositorioEr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaP(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("en");
        Optional<VerboEr> verboDBOptional = repositorioEr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboEr verboDB = verboDBOptional.get();
            verboDB.setSegundaPersonaP(verboConjugado);
            repositorioEr.save(verboDB);
        }else{
            VerboEr verbo = new VerboEr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setSegundaPersonaP(verboConjugado);
            repositorioEr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaP(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("en");
        Optional<VerboEr> verboDBOptional = repositorioEr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboEr verboDB = verboDBOptional.get();
            verboDB.setTerceraPersonaP(verboConjugado);
            repositorioEr.save(verboDB);
        }else{
            VerboEr verbo = new VerboEr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setTerceraPersonaP(verboConjugado);
            repositorioEr.save(verbo);
        }
        
        return verboConjugado;
    }
    
}
