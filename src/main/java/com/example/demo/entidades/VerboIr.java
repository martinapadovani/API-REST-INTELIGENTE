package com.example.demo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class VerboIr extends Verbo{

    @Id
    String verboInfinitivo;
    
    String primeraPersonaS;
    String segundaPersonaS;
    String terceraPersonaS;
    String primeraPersonaP;
    String segundaPersonaP;
    String terceraPersonaP;
    
}
