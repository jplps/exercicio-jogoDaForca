
package modelo;

/**
 * Representa uma partida no jogo da forca.
 * @author Joao, Marcelo, Natalia
 */
public class Partida {   
    public final Segredo s;
    public final LetrasUsadas lu;
    public final Tentativas t;
    
    /**
     * Começa uma partida com uma palavra de segredo
     * @param segredo A string que cria a palavra.
     */
    public Partida(String segredo){
        s = new Segredo(segredo);
        lu = new LetrasUsadas();
        t = new Tentativas();
    }
}
