
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
    private JLabel segredoLabel;
    
    public PainelSegredo() {
        segredoLabel = new JLabel();
        segredoLabel.setLayout(new FlowLayout());
        add(segredoLabel);
    }
    
    /**
     * Seta o segredo para o Painel observá-lo
     * @param s - O Segredo s
     */
    public void setSegredo(Segredo s){
        if(s == null)
            throw new IllegalArgumentException("Segredo não pode ser nulo.");
        s.registrarObservador(this);
        atualizar(s);
    }

    /**
     * Recebe o Segredo s para se atualizar a cada jogada
     * @param s 
     */
    @Override
    public void atualizar(Segredo s) {
        segredoLabel.setText(s.toString());
    }
}
