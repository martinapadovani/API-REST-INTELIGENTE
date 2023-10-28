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

    public VerboAr(){

    }

    public VerboAr(String verboInfinitivo, String primeraPersonaS, String segundaPersonaS, String terceraPersonaS,
            String primeraPersonaP, String segundaPersonaP, String terceraPersonaP) {
        this.verboInfinitivo = verboInfinitivo;
        this.primeraPersonaS = primeraPersonaS;
        this.segundaPersonaS = segundaPersonaS;
        this.terceraPersonaS = terceraPersonaS;
        this.primeraPersonaP = primeraPersonaP;
        this.segundaPersonaP = segundaPersonaP;
        this.terceraPersonaP = terceraPersonaP;
    }

    public String getVerboInfinitivo() {
        return verboInfinitivo;
    }
    public void setVerboInfinitivo(String verboInfinitivo) {
        this.verboInfinitivo = verboInfinitivo;
    }
    public String getPrimeraPersonaS() {
        return primeraPersonaS;
    }
    public void setPrimeraPersonaS(String primeraPersonaS) {
        this.primeraPersonaS = primeraPersonaS;
    }
    public String getSegundaPersonaS() {
        return segundaPersonaS;
    }
    public void setSegundaPersonaS(String segundaPersonaS) {
        this.segundaPersonaS = segundaPersonaS;
    }
    public String getTerceraPersonaS() {
        return terceraPersonaS;
    }
    public void setTerceraPersonaS(String terceraPersonaS) {
        this.terceraPersonaS = terceraPersonaS;
    }
    public String getPrimeraPersonaP() {
        return primeraPersonaP;
    }
    public void setPrimeraPersonaP(String primeraPersonaP) {
        this.primeraPersonaP = primeraPersonaP;
    }
    public String getSegundaPersonaP() {
        return segundaPersonaP;
    }
    public void setSegundaPersonaP(String segundaPersonaP) {
        this.segundaPersonaP = segundaPersonaP;
    }
    public String getTerceraPersonaP() {
        return terceraPersonaP;
    }
    public void setTerceraPersonaP(String terceraPersonaP) {
        this.terceraPersonaP = terceraPersonaP;
    }

    
}
