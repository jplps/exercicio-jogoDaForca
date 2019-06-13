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
public class ControlePrincipal implements CriadorPartidas {

    private final TelaPrincipal tela;
    private Partida partidaAtual;
    private final ControleLetra cl;

    public ControlePrincipal() {
        cl = new ControleLetra();
        tela = new TelaPrincipal(cl, this);
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
        cl.novoJogo(partidaAtual);
        tela.mostrarPartida(partidaAtual);
    }
}
