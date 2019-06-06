
package visao;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Observador das LetrasUsadas
 * @author João e Marcelo
 */
public class PainelUsadas extends JPanel {
    private JLabel letrasUsadas;
    
    public PainelUsadas() {
        letrasUsadas = new JLabel("labelhere");
        letrasUsadas.setSize(300, 15);
        letrasUsadas.setLocation(15, 15);
    }

    
}
