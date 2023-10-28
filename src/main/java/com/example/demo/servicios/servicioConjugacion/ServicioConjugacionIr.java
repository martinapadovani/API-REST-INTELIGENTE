package com.example.demo.servicios.servicioConjugacion;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.VerboIr;
import com.example.demo.interfaz.Conjugaciones;
import com.example.demo.repositorios.RepositorioIr;

@Service
public class ServicioConjugacionIr implements Conjugaciones {

    @Autowired
    RepositorioIr repositorioIr;

    @Override
    public String conjugacionPrimeraPersonaS(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("o");
        Optional<VerboIr> verboDBOptional = repositorioIr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboIr verboDB = verboDBOptional.get();
            verboDB.setPrimeraPersonaS(verboConjugado);
            repositorioIr.save(verboDB);
        }else{
            VerboIr verbo = new VerboIr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setPrimeraPersonaS(verboConjugado);
            repositorioIr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaS(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("is");
        Optional<VerboIr> verboDBOptional = repositorioIr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboIr verboDB = verboDBOptional.get();
            verboDB.setSegundaPersonaS(verboConjugado);
            repositorioIr.save(verboDB);
        }else{
            VerboIr verbo = new VerboIr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setSegundaPersonaS(verboConjugado);
            repositorioIr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaS(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("i");
        Optional<VerboIr> verboDBOptional = repositorioIr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboIr verboDB = verboDBOptional.get();
            verboDB.setTerceraPersonaS(verboConjugado);
            repositorioIr.save(verboDB);
        }else{
            VerboIr verbo = new VerboIr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setTerceraPersonaS(verboConjugado);
            repositorioIr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionPrimeraPersonaP(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("imos");
        Optional<VerboIr> verboDBOptional = repositorioIr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboIr verboDB = verboDBOptional.get();
            verboDB.setPrimeraPersonaP(verboConjugado);
            repositorioIr.save(verboDB);
        }else{
            VerboIr verbo = new VerboIr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setPrimeraPersonaP(verboConjugado);
            repositorioIr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaP(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("en");
        Optional<VerboIr> verboDBOptional = repositorioIr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboIr verboDB = verboDBOptional.get();
            verboDB.setSegundaPersonaP(verboConjugado);
            repositorioIr.save(verboDB);
        }else{
            VerboIr verbo = new VerboIr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setSegundaPersonaP(verboConjugado);
            repositorioIr.save(verbo);
        }

        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaP(String raiz, String verboInfinitivo){
        String verboConjugado = raiz.concat("en");
        Optional<VerboIr> verboDBOptional = repositorioIr.findById(verboInfinitivo);

        if(verboDBOptional.isPresent()){
            VerboIr verboDB = verboDBOptional.get();
            verboDB.setTerceraPersonaP(verboConjugado);
            repositorioIr.save(verboDB);
        }else{
            VerboIr verbo = new VerboIr();
            verbo.setVerboInfinitivo(verboInfinitivo);
            verbo.setTerceraPersonaP(verboConjugado);
            repositorioIr.save(verbo);
        }

        return verboConjugado;
    }
}
