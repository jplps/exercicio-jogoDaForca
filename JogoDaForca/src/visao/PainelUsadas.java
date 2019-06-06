
package visao;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Letra;
import modelo.interfaces.ObservadorLetrasUsadas;

/**
 * Observador das LetrasUsadas
 * @author João e Marcelo
 */
public class PainelUsadas extends JPanel implements ObservadorLetrasUsadas {
    private JLabel letrasUsadas;
    
    public PainelUsadas() {
        letrasUsadas = new JLabel("");
        letrasUsadas.setLayout(new FlowLayout());
        add(letrasUsadas);
    }

    @Override
    public void novaLetra(Letra l) {
        letrasUsadas.setText(letrasUsadas.getText() + " " + l);
    }

}
