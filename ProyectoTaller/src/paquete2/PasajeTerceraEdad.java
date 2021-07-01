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
public class PasajeTerceraEdad extends PasajeInterCantonal {

    public PasajeTerceraEdad(String nombrePasajero, String cedula, String 
            destino, int kmDistancia, double tarifaBase) {
        super(nombrePasajero, cedula, destino, kmDistancia, tarifaBase);
    }

    @Override
    public void setValorPasaje() {
        valorPasaje = (kmDistancia * 0.5)+(tarifaBase /2);
    }

}