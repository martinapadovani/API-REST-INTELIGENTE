package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.VerboAr;


@Repository
public interface RepositorioAr extends CrudRepository<VerboAr, String>{
 
    //Consultas con naming convención
    public abstract String findByPrimeraPersonaS(String verbo);
    public abstract String findBySegundaPersonaS(String verbo);
    public abstract String findByTerceraPersonaS(String verbo);
    public abstract String findByPrimeraPersonaP(String verbo);
    public abstract String findBySegundaPersonaP(String verbo);
    public abstract String findByTerceraPersonaP(String verbo);

    //Consultas Personalizadas

    @Query //anotación para definir una consulta personalizada en SQL nativo
    (value = "SELECT primera_personas FROM verbo_ar WHERE verbo_infinitivo = ?1", nativeQuery = true)
    //Value es la consulta SQL
    /*nativeQuery = true indica que es una consulta SQL nativa en lugar de una consulta JPQL
      - SQL nativo es SQL estándar del motor de base de datos que se está utilizando,
      - JPQL es un lenguaje de consulta específico de JPA que es independiente del motor de base de datos.
    */
    /*?1 es un marcador de posición para un parámetro, y representa al primer parámetro del método,
    que se proporcionará en tiempo de ejecución.
    */
    String findPrimeraPersonaSByVerboInfinitivo(String verboInfinitivo);
    //método del repositorio que se utiliza para realizar la consulta personalizada. 
    //Recibe por parametro el verboInfinitivo, que reemplazara a ?1 en la consulta SQL.

    @Query
    (value = "SELECT segunda_personas FROM verbo_ar WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraSegundaSByVerboInfinitivo(String verboInfinitivo);

    @Query
    (value = "SELECT tercera_personas FROM verbo_ar WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraTerceraSByVerboInfinitivo(String verboInfinitivo);

    @Query
    (value = "SELECT primera_personap FROM verbo_ar WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraPersonaPByVerboInfinitivo(String verboInfinitivo);

    @Query
    (value = "SELECT segunda_personap FROM verbo_ar WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraSegundaPByVerboInfinitivo(String verboInfinitivo);

    @Query
    (value = "SELECT tercera_personap FROM verbo_ar WHERE verbo_infinitivo = ?1", nativeQuery = true)
    String findPrimeraTerceraPByVerboInfinitivo(String verboInfinitivo);


}
