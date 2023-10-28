package com.example.demo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table()
public class VerboAr extends Verbo{

    //La tabla necesita un id, podria ser el propio verbo y no un nombre.

    @Id
    String verboInfinitivo;
    
    String primeraPersonaS;
    String segundaPersonaS;
    String terceraPersonaS;
    String primeraPersonaP;
    String segundaPersonaP;
    String terceraPersonaP;
}
