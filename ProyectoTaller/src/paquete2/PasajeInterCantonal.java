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
public abstract class PasajeInterCantonal implements Serializable {

    protected String nombrePasajero;
    protected String cedula;
    protected String origen;
    protected String destino;
    protected int kmDistancia;
    protected double tarifaBase;
    protected double valorPasaje;

    public PasajeInterCantonal(String nombrePasajero, String cedula,
            String destino, int kmDistancia, double tarifaBase) {
        this.nombrePasajero = nombrePasajero;
        this.cedula = cedula;
        this.destino = destino;
        this.kmDistancia = kmDistancia;
        this.tarifaBase = tarifaBase;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setKmDistancia(int kmDistancia) {
        this.kmDistancia = kmDistancia;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public abstract void setValorPasaje();

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public String getCedula() {
        return cedula;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getKmDistancia() {
        return kmDistancia;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    @Override
    public String toString() {
        return String.format("Nombre del Pasajero: %s\n"
                + "Cedula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Km de Distancia: %dkm\n"
                + "Tarifa Base: %.2f$\n",
                nombrePasajero, cedula, origen,
                destino, kmDistancia, tarifaBase);
    }

}
