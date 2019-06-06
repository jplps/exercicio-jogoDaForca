
package visao;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Observador do Segredo
 * @author Joao e Marcelo
 */
public class PainelSegredo extends JPanel {
    private JLabel segredo;
    
    public PainelSegredo() {
        segredo = new JLabel("_ _ _ _");
        segredo.setLayout(new FlowLayout());
        add(segredo);
    }
}
