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
public class verificarNomeTime {

    public static boolean verificarNome(String [] nome)
    {
        boolean verificado = true;
        for(int i = 0; i < nome.length; i ++)
        {
            if(nome[i].length() > 10)
            {
                verificado = false;
            }
        
        }
        return verificado;
    }
}
