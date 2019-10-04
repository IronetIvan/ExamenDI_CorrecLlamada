/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendi_correcllamada;

/**
 *
 * @author Usuario DAM 2
 */
public abstract class Llamada {
    int n1origen, n1destino, duracion;
    double coste;

    public Llamada(int n1origen, int n1destino, int duracion) {
        this.n1origen = n1origen;
        this.n1destino = n1destino;
        this.duracion = duracion;
    }
    public abstract void calcularCoste();
    
    public void mostrarDatos(){
        System.out.printf("Tipo de llamada %s" , getClass().getName());
        System.out.printf("Numero origen %d" , n1origen);
        System.out.printf("Numero destino %d" , n1destino);
        System.out.printf("Numero duracion %d" , duracion);
        System.out.printf("Numero coste %d" , coste);
    }
    
    public int getN1origen() {
        return n1origen;
    }

    public void setN1origen(int n1origen) {
        this.n1origen = n1origen;
    }

    public int getN1destino() {
        return n1destino;
    }

    public void setN1destino(int n1destino) {
        this.n1destino = n1destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
}
