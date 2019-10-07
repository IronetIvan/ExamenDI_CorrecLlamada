/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendi_correcllamada;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario DAM 2
 */
public class Centralita {

    ArrayList<Llamada> listaLlamadas;
    double acumuladorCoste;

    public Centralita() {
    }

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
    public void exportarDatos(){
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutput;
        File f = new File("src/documentos/llamadas.obj");
        try {
            fileOutput = new FileOutputStream(f);
            objectOutputStream = new ObjectOutputStream(fileOutput);
            objectOutputStream.writeObject(listaLlamadas);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NullPointerException e){
                e.printStackTrace();
            }
    }
}
}
