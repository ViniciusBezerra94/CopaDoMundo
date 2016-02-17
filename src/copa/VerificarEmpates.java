/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copa;

/**
 *
 * @author Vinicius
 */
public class VerificarEmpates 
{

    public int VerificarEmpates(int [] resultJogos, int numeroJogos)
    {
        int somaPontos = 0;
        int numeroEmpates = 0;
            for(int i = 0; i < resultJogos.length; i++)
            {
                somaPontos = somaPontos + resultJogos[i];
            }
            
            numeroEmpates = (numeroJogos * 3) - somaPontos;
        return numeroEmpates;
    }
}
