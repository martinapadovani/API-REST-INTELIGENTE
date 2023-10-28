package com.example.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Verbo;
import com.example.demo.servicios.ServicioConjugacionTodos.ServicioConjugacionTodosAr;
import com.example.demo.servicios.ServicioConjugacionTodos.ServicioConjugacionTodosEr;
import com.example.demo.servicios.ServicioConjugacionTodos.ServicioConjugacionTodosIr;
import com.example.demo.servicios.servicioDistinguirSujeto.ServicioDistinguirSujetoAr;
import com.example.demo.servicios.servicioDistinguirSujeto.ServicioDistinguirSujetoEr;
import com.example.demo.servicios.servicioDistinguirSujeto.ServicioDistinguirSujetoIr;

@Service
public class Servicio {

    //Distinguir sujeto a conjugar

    @Autowired
    ServicioDistinguirSujetoAr servicioDistinguirSujetoAr;

    @Autowired
    ServicioDistinguirSujetoEr servicioDistinguirSujetoEr;

    @Autowired
    ServicioDistinguirSujetoIr servicioDistinguirSujetoIr;  

    //Conjugar en todos los sujetos

    @Autowired
    ServicioConjugacionTodosAr servicioConjugacionTodosAr;

    @Autowired
    ServicioConjugacionTodosEr servicioConjugacionTodosEr;

    @Autowired
    ServicioConjugacionTodosIr servicioConjugacionTodosIr;


    public String conjugarSujeto(String verboInfinitivo, String sujeto){

        boolean terminacionAR = verboInfinitivo.endsWith("ar");
        boolean terminacionER = verboInfinitivo.endsWith("er");
        boolean terminacionIR = verboInfinitivo.endsWith("ir");

        String conjugacion = null;

        if(terminacionAR){

            return  conjugacion =  servicioDistinguirSujetoAr.distinguirSujetoAr(sujeto, verboInfinitivo);

        }if(terminacionER){

            return conjugacion =  servicioDistinguirSujetoEr.distinguirSujetoEr(sujeto, verboInfinitivo);

        }if(terminacionIR){

            return conjugacion =  servicioDistinguirSujetoIr.distinguirSujetoIr(sujeto, verboInfinitivo);

        }

        return conjugacion;
    }

    public Verbo conjugarTodos(String verboInfinitivo){

        boolean terminacionAR = verboInfinitivo.endsWith("ar");
        boolean terminacionER = verboInfinitivo.endsWith("er");
        boolean terminacionIR = verboInfinitivo.endsWith("ir");

        Verbo verboConjugado = new Verbo();

        if(terminacionAR){

            return  verboConjugado =  servicioConjugacionTodosAr.obtenerConjugaciones(verboInfinitivo);

        }if(terminacionER){

            return verboConjugado =  servicioConjugacionTodosEr.obtenerConjugaciones(verboInfinitivo);

        }if(terminacionIR){

            return verboConjugado =  servicioConjugacionTodosIr.obtenerConjugaciones(verboInfinitivo);
            
        }

        return verboConjugado;
    }
}
