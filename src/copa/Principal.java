/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copa;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Vinicius
 */
public class Principal {
    public static void main(String[] args)
    {
        InserirCarga carga = new InserirCarga();
        InserirJogos inputJogos = new InserirJogos();
        VerificarEmpates Empates = new VerificarEmpates();
        
        Queue <String> jogos = new LinkedList<>();
        
        carga.InserirC(jogos);
        inputJogos.inserirJ(jogos);
        System.out.println("Numero de empates:" +Empates.VerificarEmpates(inputJogos.pontos, inputJogos.getNumeroDeJogos()));
        
    
    }
}
