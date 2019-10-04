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
public class LlamadaInter extends Llamada {

    String franja;

    public LlamadaInter(int n1origen, int n1destino, int duracion, String franja) {
        super(n1origen, n1destino, duracion);
        this.franja = franja;
    }

    @Override
    public void calcularCoste() {
        switch (franja) {
            case "A":
                coste = duracion * 0.40;
                break;
            case "B":
                coste = duracion * 0.70;
                break;
            case "C":
                coste = duracion * 1;
                break;
            default:
                coste = 0;
                break;
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("La tarifa: %s %n", franja);
    }
    
}
