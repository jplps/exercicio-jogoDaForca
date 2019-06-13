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
    
    public void comecar() {
        partidaAtual = new Partida("Programacao");
        cl.novoJogo(partidaAtual);
        tela.mostrarPartida(partidaAtual);
        tela.setVisible(true);
    }
    
}
