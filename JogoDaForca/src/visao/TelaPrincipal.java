/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.CriadorJogadas;
import controle.CriadorPartidas;
import controle.IControle;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import modelo.Partida;

/**
 *
 * @author aluno
 */
public class TelaPrincipal extends JFrame {
    
    private PainelPrincipal painel;
    
    private void inicializarComponentes(IControle controle) {
        painel = new PainelPrincipal(controle);
        add(painel);
    }
    
    public TelaPrincipal(IControle controle) {
        setSize(400, 400);
        setTitle("Jogo da Forca");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        inicializarComponentes(controle);
        
    }

    public void mostrarPartida(Partida partidaAtual) {
        painel.mostrarPartida(partidaAtual);
    }
    
    public void mostrarEstado(Partida p) {
        switch(p.estado()) {
            case DERROTA:
                avisarDerrota();
                break;
            case VITORIA:
                avisarVitoria();
                break;
        }
    }
    
    private void avisarDerrota() {
        JOptionPane.showMessageDialog(this, "Você Perdeu");
        
    }
    
    private void avisarVitoria() {
        JOptionPane.showMessageDialog(this, "Você Ganhou");
    }
    
}
