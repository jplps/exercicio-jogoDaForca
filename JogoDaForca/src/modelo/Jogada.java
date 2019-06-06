
package modelo;

/**
 * Representa uma jogada do jogador em um jogo da forca.
 * @author Joao e Marcelo
 */
public class Jogada {
    public final Letra letra;
    public final LetrasUsadas contexto;
    
    /**
     * @param l A letra da jogada.
     * @param lu O contexto do jogo.
     */
    public Jogada(Letra l, LetrasUsadas lu){
        contexto = lu;
        letra = l;
        validar();
    }

    
    /**
     * Verifica se a letra e o contexto são validos para a jogada.
     * @throws IllegalArgumentException se o contexto ou a letra são nulos ou se a palavra já foi usada no contexto.
     */
    private void validar(){
        if(letra == null)
            throw new IllegalArgumentException("A letra não pode ser nula.");
        
        if(contexto == null)
            throw new IllegalArgumentException("O contexto não pode ser nulo.");
        
        if(contexto.usada(letra))
            throw new IllegalArgumentException("A letra da jogada já foi usada.");
    }
}
