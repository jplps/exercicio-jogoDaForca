
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class LetrasUsadas {
    private final ArrayList<Letra> lista;
    
    public LetrasUsadas(){
        lista = new ArrayList();
    }
    
    public boolean usada(Letra l){
        return lista.contains(l);       
    }
    
    public void registrarLetra(Letra l){
        if(usada(l))
            throw new IllegalArgumentException("A letra já foi usada.");
        lista.add(l);
    }
}
