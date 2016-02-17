/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Queue;

/**
 *
 * @author Vinicius
 */
public class InserirCarga {
    
    
    public void InserirC(Queue <String> carga)
    {
                try
        {
            FileReader arq = new FileReader("C:\\Users\\Vinicius\\Desktop\\Nova pasta\\jogos.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            
            while (linha != null ) 
            {   
               carga.add(linha);  
               linha = lerArq.readLine();
               
            }

        }catch(IOException e )
        {
            System.out.println("Erro ->" + e.getMessage());
        } 
    
    }
}
