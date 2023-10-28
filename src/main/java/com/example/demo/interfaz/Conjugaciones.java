package com.example.demo.interfaz;

public interface Conjugaciones {

    //Singular
    public String conjugacionPrimeraPersonaS(String raiz, String verboInfinitivo);
    public String conjugacionSegundaPersonaS(String raiz, String verboInfinitivo);
    public String conjugacionTerceraPersonaS(String raiz, String verboInfinitivo);

    //Plural
    public String conjugacionPrimeraPersonaP(String raiz, String verboInfinitivo);
    public String conjugacionSegundaPersonaP(String raiz, String verboInfinitivo);
    public String conjugacionTerceraPersonaP(String raiz, String verboInfinitivo);
}
