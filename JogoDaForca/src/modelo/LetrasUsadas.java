
package modelo;

import java.util.ArrayList;
import modelo.interfaces.ObservadorLetrasUsadas;

/**
 * Representa todas as letras já usadas em uma partida de jogo da forca.
 * @author Joao e Marcelo
 */
public class LetrasUsadas {
    private final ArrayList<Letra> lista;
    private ObservadorLetrasUsadas observador;
    
    /**
     * Cria um novo objeto para guardar as letras já usadas.
     */
    public LetrasUsadas(){
        lista = new ArrayList();
    }
 
    /**
     * @param l Uma letra.
     * @throws IllegalArgumentException caso l seja nulo.
     * @return se a letra l já foi usada ou não.
     */
    public boolean usada(Letra l){
        if(l == null)
            throw new IllegalArgumentException("Não se pode jogar letras nulas");
        return lista.contains(l);       
    }
    
    /**
     * Registra uma letra l na listra de letras já usadas no jogo.
     * @param l A letra que será registrada.
     */
    public void registrarLetra(Letra l){
        if(!usada(l)){
            lista.add(l);
            if(observador != null)
                observador.novaLetra(l);
        }
    }
    
    public void registrarObservador(ObservadorLetrasUsadas obs){
        observador = obs;
    }
}
