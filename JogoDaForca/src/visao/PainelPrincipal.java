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

/**
 *
 * @author aluno
 */
public class PainelPrincipal extends JPanel {

    private PainelLetra pLetra;
    private PainelPartida pPartida;
    
    private PainelSegredo pSegredo;
    private PainelUsadas pUsadas;
    
    public PainelPrincipal(CriadorJogadas cj) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        iniciarPaineis(cj);
        adicionarPaineis();
    }

    private void iniciarPaineis(CriadorJogadas cj) {
        pLetra = new PainelLetra();
        pPartida = new PainelPartida();
        pSegredo = new PainelSegredo();
        pUsadas = new PainelUsadas();
        
        pLetra.novaPartida(cj);
    }

    private void adicionarPaineis() {
        add(pUsadas);
        add(pSegredo);
        add(pLetra);
        add(pPartida);
    }

    void mostrarPartida(Partida partidaAtual) {
        partidaAtual.letrasusadas.registrarObservador(pUsadas);
        partidaAtual.segredo.registrarObservador(pSegredo);
    }
}
