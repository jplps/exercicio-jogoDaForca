/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Partida;
import visao.TelaPrincipal;

/**
 *
 * @author aluno
 */
public class ControlePrincipal {
    private final TelaPrincipal tela;
    private Partida partidaAtual;
    private final ControleLetra cl;
    
    public ControlePrincipal() {
        cl = new ControleLetra();
        tela = new TelaPrincipal(cl);        
    }
    
    /**
     * Começa de fato uma partida, atribuindo uma palavra à partida e uma 
     * partida à um jogo.
     */
    public void comecar() {
        partidaAtual = new Partida("acao");
        cl.novoJogo(partidaAtual);
        tela.mostrarPartida(partidaAtual);
        tela.setVisible(true);
    }   
}
