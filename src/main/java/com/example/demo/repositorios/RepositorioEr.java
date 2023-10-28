package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entidades.VerboEr;

@Repository
public interface RepositorioEr extends CrudRepository<VerboEr, String> {

    public abstract String findByPrimeraPersonaS(String verbo);
    public abstract String findBySegundaPersonaS(String verbo);
    public abstract String findByTerceraPersonaS(String verbo);
    public abstract String findByPrimeraPersonaP(String verbo);
    public abstract String findBySegundaPersonaP(String verbo);
    public abstract String findByTerceraPersonaP(String verbo);


    @Query
    (value = "SELECT primera_personas FROM verbo_er WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraPersonaSByVerboInfinitivo(String verboInfinitivo);

    @Query
    (value = "SELECT segunda_personas FROM verbo_er WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraSegundaSByVerboInfinitivo(String verboInfinitivo);

    @Query
    (value = "SELECT tercera_personas FROM verbo_er WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraTerceraSByVerboInfinitivo(String verboInfinitivo);

    @Query
    (value = "SELECT primera_personap FROM verbo_er WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraPersonaPByVerboInfinitivo(String verboInfinitivo);

    @Query
    (value = "SELECT segunda_personap FROM verbo_er WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraSegundaPByVerboInfinitivo(String verboInfinitivo);

    @Query
    (value = "SELECT tercera_personap FROM verbo_er WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraTerceraPByVerboInfinitivo(String verboInfinitivo);
    
}
