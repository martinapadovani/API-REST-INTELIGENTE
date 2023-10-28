package com.example.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Verbo;
import com.example.demo.servicios.servicioDistinguirSujeto.ServicioDistinguirSujetoAr;
import com.example.demo.servicios.servicioDistinguirSujeto.ServicioDistinguirSujetoEr;
import com.example.demo.servicios.servicioDistinguirSujeto.ServicioDistinguirSujetoIr;

@Service
public class Servicio {

    @Autowired
    ServicioDistinguirSujetoAr servicioDistinguirSujetoAr;

    @Autowired
    ServicioDistinguirSujetoEr servicioDistinguirSujetoEr;

    @Autowired
    ServicioDistinguirSujetoIr servicioDistinguirSujetoIr;  


    public String conjugar(String verboInfinitivo, String sujeto){

        boolean terminacionAR = verboInfinitivo.endsWith("ar");
        boolean terminacionER = verboInfinitivo.endsWith("er");
        boolean terminacionIR = verboInfinitivo.endsWith("ir");

        String conjugacion = null;

        if(terminacionAR){

            conjugacion =  servicioDistinguirSujetoAr.distinguirSujetoAr(sujeto, verboInfinitivo);

        }if(terminacionER){

            conjugacion =  servicioDistinguirSujetoEr.distinguirSujetoEr(sujeto, verboInfinitivo);

        }if(terminacionIR){

            conjugacion =  servicioDistinguirSujetoIr.distinguirSujetoIr(sujeto, verboInfinitivo);

        }

        return conjugacion;
    }
}
