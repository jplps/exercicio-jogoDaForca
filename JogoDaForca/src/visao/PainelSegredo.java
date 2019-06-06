
package visao;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Segredo;
import modelo.interfaces.ObservadorSegredo;

/**
 * Observador do Segredo
 * @author Joao e Marcelo
 */
public class PainelSegredo extends JPanel implements ObservadorSegredo {
    private JLabel segredo;
    
    public PainelSegredo() {
        segredo = new JLabel("");
        segredo.setLayout(new FlowLayout());
        add(segredo);
    }

    @Override
    public void atualizar(Segredo s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
