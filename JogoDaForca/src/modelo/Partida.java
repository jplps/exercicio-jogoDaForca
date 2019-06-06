
package modelo;

/**
 *
 * @author aluno
 */
public class Partida {   
    public final Segredo s;
    public final LetrasUsadas lu;
    public final Tentativas t;
    
    public Partida(String segredo){
        s = new Segredo(segredo);
        lu = new LetrasUsadas();
        t = new Tentativas();
    }
}
