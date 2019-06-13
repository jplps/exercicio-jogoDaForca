/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.CriadorJogadas;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import modelo.Partida;

/**
 *
 * @author aluno
 */
public class TelaPrincipal extends JFrame {
    
    private PainelPrincipal painel;
    
    private void inicializarComponentes(CriadorJogadas cj) {
        painel = new PainelPrincipal(cj);
        add(painel);
    }
    
    public TelaPrincipal(CriadorJogadas cj) {
        setSize(400, 400);
        setTitle("Jogo da Forca");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        inicializarComponentes(cj);
        
    }

    public void mostrarPartida(Partida partidaAtual) {
        painel.mostrarPartida(partidaAtual);
    }
    
}
