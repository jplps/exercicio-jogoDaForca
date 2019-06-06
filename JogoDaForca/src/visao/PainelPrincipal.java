/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import modelo.Partida;

/**
 *
 * @author aluno
 */
public class PainelPrincipal extends JPanel {
    
    private JPanel pLetra;
    private JPanel pPartida;
    private PainelSegredo pSegredo;
    private PainelUsadas pUsadas;
    
    public PainelPrincipal() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        iniciarPaineis();
        adicionarPaineis();
    }

    private void iniciarPaineis() {
        pLetra = new JPanel();
        pPartida = new JPanel();
        pSegredo = new PainelSegredo();
        pUsadas = new PainelUsadas();
    }

    private void adicionarPaineis() {
        add(pUsadas);
        add(pSegredo);
        add(pLetra);
        add(pPartida);
    }

    void mostrarPartida(Partida partidaAtual) {
        partidaAtual.letrasusadas.registrarObservador(pUsadas);
        
    }
}
