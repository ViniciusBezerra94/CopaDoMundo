/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copa;

import java.util.Queue;

/**
 *
 * @author Vinicius
 */
public class InserirJogos {
    private int numeroDeJogos;
    String[] nomeTime ;
    int[] pontos ;

    public int getNumeroDeJogos() {
        return numeroDeJogos;
    }

    public void setNumeroDeJogos(int numeroDeJogos) {
        this.numeroDeJogos = numeroDeJogos;
    }
    public void inserirJ(Queue<String> carga) {




        int i = 0;
  

        try {
            String numeroJogos = carga.remove();
             
        

                String[] arrayN = new String[2];
                arrayN = numeroJogos.split(" ");
                numeroDeJogos = Integer.parseInt(arrayN[1]);
                int tamanho = carga.size();
                nomeTime = new String[tamanho];
                pontos = new int[tamanho];
                

            while (!carga.isEmpty()) {
              
                String frase = carga.remove();
        

                String[] array = new String[2];
                array = frase.split(" ");

                String auxNomeTime = (array[0]);
                int auxPontos  = Integer.parseInt(array[1]);
                
                nomeTime[i] = auxNomeTime;
                pontos[i] = auxPontos;
                i++;



                

            }
        } catch (Exception e) {
            System.out.println("deu erro ");

        }

    }
}
