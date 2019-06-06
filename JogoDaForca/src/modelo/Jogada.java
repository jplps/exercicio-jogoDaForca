
package modelo;

/**
 *
 * @author aluno
 */
public class Jogada {
    public final Letra letra;
    public final LetrasUsadas contexto;
    
    public Jogada(Letra l, LetrasUsadas lu){
        contexto = lu;
        letra = l;
        validar();
    }

    private void validar(){
        if(letra == null)
            throw new IllegalArgumentException("A letra não pode ser nula.");
        
        if(contexto == null)
            throw new IllegalArgumentException("O contexto não pode ser nulo.");
        
        if(contexto.usada(letra))
            throw new IllegalArgumentException("A letra da jogada já foi usada.");
    }
    
    public boolean jogar(Segredo s){
        if(s == null)
            throw new IllegalArgumentException("O Segredo não pode ser nulo.");
        contexto.registrarLetra(letra);
        return s.receberLetra(letra);
    }
}
