/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendi_correcllamada;

import java.util.ArrayList;

/**
 *
 * @author Usuario DAM 2
 */
public class Centralita {

    ArrayList<Llamada> listaLlamadas;
    double acumuladorCoste;

    public Centralita(ArrayList<Llamada> listaLlamadas) {
        this.listaLlamadas = listaLlamadas;
    }

    public void registrarLlamada(Llamada llamada) {
        listaLlamadas.add(llamada);
    }

    public void calcularCostes() {
        for (Llamada item : listaLlamadas) {
            acumuladorCoste += item.getCoste();
        }

    }

    public void mostrarDatos() {
        for (Llamada item : listaLlamadas) {
            item.mostrarDatos();
        }
    }
}
