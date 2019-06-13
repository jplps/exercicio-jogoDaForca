/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;


import javax.swing.BoxLayout;
import controle.CriadorJogadas;
import javax.swing.JPanel;
import modelo.Partida;
import modelo.Segredo;

/**
 *
 * @author João, Carlos e Leandro
 */
public class PainelPrincipal extends JPanel {
    private PainelLetra pLetra;
    private PainelPartida pPartida;
    private PainelSegredo pSegredo;
    private PainelUsadas pUsadas;
    
    /**
     * Construtói o painel principal
     * @param cj Criador de jogadas implementado pelo controle de letras
     */
    public PainelPrincipal(CriadorJogadas cj) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        iniciarPaineis(cj);
        adicionarPaineis();
    }

    /**
     * Inicia painéis do jogo
     * @param cj 
     */
    private void iniciarPaineis(CriadorJogadas cj) {
        pLetra = new PainelLetra();
        pPartida = new PainelPartida();
        pSegredo = new PainelSegredo();
        pUsadas = new PainelUsadas();
        
        pLetra.novaPartida(cj);
    }

    /**
     * Adiciona os Painéis no PainelPrincipal
     */
    private void adicionarPaineis() {
        add(pUsadas);
        add(pSegredo);
        add(pLetra);
        add(pPartida);
    }

    /**
     * Registra observadores do segredo e o Segredo na partida atual.
     * @param partidaAtual - Partida sendo jogada
     */
    void mostrarPartida(Partida partidaAtual) {
        partidaAtual.letrasusadas.registrarObservador(pUsadas);
        partidaAtual.segredo.registrarObservador(pSegredo);
        pSegredo.setSegredo(partidaAtual.segredo);
    }
}
