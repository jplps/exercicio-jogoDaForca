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
    
    
    public ControlePrincipal() {
        tela = new TelaPrincipal();
    }
    
    public void comecar() {
        partidaAtual = new Partida("programacao");
        tela.mostrarPartida(partidaAtual);
        tela.setVisible(true);
    }
}
