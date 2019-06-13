/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Partida;

/**
 *
 * @author aluno
 */
public class ControleLetra implements CriadorJogadas {
    private Partida partida;
    
    
    
    public void novoJogo(Partida p){
       partida = p;
    }
    
    @Override
    public void receberLetra(char c){
        partida.jogar(c);
        
    }
    
}
