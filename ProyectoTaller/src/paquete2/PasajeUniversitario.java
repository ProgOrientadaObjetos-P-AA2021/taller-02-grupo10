/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class PasajeUniversitario extends PasajeInterCantonal {
    
    protected String nomUniversidad;

    public PasajeUniversitario(String nomUniversidad, String nombrePasajero,
            String cedula, String destino, int kmDistancia, double tarifaBase) {
        super(nombrePasajero, cedula, destino, kmDistancia, tarifaBase);
        this.nomUniversidad = nomUniversidad;
        
    }

    public void setNomUniversidad(String nomUniversidad) {
        this.nomUniversidad = nomUniversidad;
        
    }

    public String getNomUniversidad() {
        return nomUniversidad;
    }

    @Override
    public void setValorPasaje() {
        valorPasaje =(tarifaBase / 2);
    }
}
