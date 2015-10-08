/**
 * Pequeno método que retorna o máximo divisor comum entre os dois inteiros
 * fornecidos como argumento.
 */

package br.uf.inf.es.construcao.maximodivisorcomum;

public class MaximoDivisorComum {
    
    /**
     * @param inteiorMaior inteiro de maior valor
     * @param inteiroMenor inteiro de menor valor
     * @return maximo divisor comum
     */
    public int calculaMaximoDivisorComum(int inteiroMaior, int inteiroMenor) {
        if (inteiroMaior < inteiroMenor || inteiroMenor <= 0) {
            throw new IllegalArgumentException("Um dos argumentos é inválido");
        }
        
        int moduloAB;
        int minimoMultiplo = 0;
                
        while (inteiroMenor != 0) {            
          moduloAB = inteiroMaior % inteiroMenor;
          inteiroMaior = inteiroMenor;
          inteiroMenor = moduloAB;
        }
        minimoMultiplo = inteiroMaior;
        
        return minimoMultiplo;
    }
}
