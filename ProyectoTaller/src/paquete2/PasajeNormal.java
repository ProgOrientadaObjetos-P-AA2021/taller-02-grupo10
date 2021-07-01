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
public class PasajeNormal extends PasajeInterCantonal
        implements Serializable {

    private int porcentajeAdicional;

    public PasajeNormal(int porcentajeAdicional, String nombrePasajero,
            String cedula, String origen, String destino, int kmDistancia,
            double tarifaBase) {
        super(nombrePasajero, cedula, origen, destino, kmDistancia, tarifaBase);
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public void setPorcentajeAdicional(int porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public int getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public void setValorPasaje() {
        valorPasaje = (kmDistancia * 0.15)
                + (tarifaBase - (tarifaBase * (porcentajeAdicional / 100)));
    }

    @Override
    public String toString() {
        String cadena = String.format("-------- Pasaje Normal --------\n"
                + "%sPorcentaje Adicional: %d%s\n"
                + "Costo del Pasaje: %.2f$\n",
                super.toString(), getPorcentajeAdicional(), "%",
                getValorPasaje());
        return cadena;
    }

}
