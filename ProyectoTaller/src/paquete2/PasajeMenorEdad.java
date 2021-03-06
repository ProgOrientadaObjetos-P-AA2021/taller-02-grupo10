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
public class PasajeMenorEdad extends PasajeInterCantonal
        implements Serializable {

    private int porcentajeDescuento;

    public PasajeMenorEdad(int porcentajeDescuento, String nombrePasajero,
            String cedula, String origen, String destino, int kmDistancia,
            double tarifaBase) {
        super(nombrePasajero, cedula, origen, destino, kmDistancia, tarifaBase);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public void setValorPasaje() {
        valorPasaje = (kmDistancia * 0.10)
                + (tarifaBase - (tarifaBase * (porcentajeDescuento / 100)));
    }

    @Override
    public String toString() {
        String cadena = String.format("-------- Pasaje Menor de Edad --------\n"
                + "%sPorcentaje de Descuento: %d%s\n"
                + "Costo del Pasaje: %.2f$\n",
                super.toString(), getPorcentajeDescuento(),"%", getValorPasaje());
        return cadena;
    }

}
