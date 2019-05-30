
package modelo;

/**
 *
 * @author aluno
 */
public class Tentativas {
    public static final int maximo = 6;
    private int atual;
    
    public Tentativas() {
        atual = maximo;
    }
    
    public int atual(){
        return atual;
    }
    
    public void errou(){
        if(atual > 0)
            atual--;       
    }
    
    public boolean acabou(){
        return atual == 0;
    }
}
