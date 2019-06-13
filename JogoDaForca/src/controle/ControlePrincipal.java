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
 * @author João, Carlos e Leandro
 */
public class ControlePrincipal implements IControle {

    private final TelaPrincipal tela;
    private Partida partidaAtual;

    public ControlePrincipal() {
        tela = new TelaPrincipal(this);
    }

    /**
     * Começa de fato uma partida, atribuindo uma palavra à partida e uma
     * partida à um jogo.
     */
    public void comecar() {
        novaPartida();
        tela.setVisible(true);
    }

    @Override
    public void novaPartida() {
        partidaAtual = new Partida("acao");
        tela.mostrarPartida(partidaAtual);
    }

    @Override
    public void receberLetra(char c) {
        partidaAtual.jogar(c);
        tela.mostrarEstado(partidaAtual);
    }
}
