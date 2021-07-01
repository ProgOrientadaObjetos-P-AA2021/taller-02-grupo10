/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "pasajes.txt";
        //Creacion del ArrayList
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();
        //Creacion de los Objetos
        PasajeMenorEdad pasajeM = new PasajeMenorEdad(12, "Renny Poma",
                "121273128", "Loja", "Catamayo", 32, 0.50);
        PasajeNormal pasajeN = new PasajeNormal(10, "Nixon Vuele",
                "1212123128", "Loja", "Catamayo", 32, 0.50);
        PasajeTerceraEdad pasajeT = new PasajeTerceraEdad("Renny Poma 2",
                "121273128", "Loja", "Catamayo", 32, 0.50);
        PasajeUniversitario pasajeU = new PasajeUniversitario("UTPL",
                "Nixon Vuele 2", "121273128", "Loja", "Catamayo", 32, 0.50);
        //Añadimos los objetos al Arraylist De objetos
        pasajes.add(pasajeM);
        pasajes.add(pasajeN);
        pasajes.add(pasajeT);
        pasajes.add(pasajeU);
        //Calculamos el costo de pasaje de todos los objetos
        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).setValorPasaje();
        }
        //Escribimos el archivo
        EscrituraArchivoSecuencial archivo
                = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < pasajes.size(); i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
        //Cerramos el archivo
        archivo.cerrarArchivo();
        //Leemos el Archivo
        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaPasajes();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
