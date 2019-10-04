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
public class LlamadaLocal extends Llamada{

    public LlamadaLocal(int n1origen, int n1destino, int duracion) {
        super(n1origen, n1destino, duracion);
        calcularCoste();
    }
    @Override
    public void calcularCoste() {
        coste = 0;
    }
    
}
