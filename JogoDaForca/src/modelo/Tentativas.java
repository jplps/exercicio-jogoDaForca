
package modelo;

/**
 * Uma representação para o boneco do jogo da forca.
 * @author Joao e Marcelo
 */
public class Tentativas {
    public static final int maximo = 6;
    private int atual;

    /**
     * Cria um novo objeto com o máximo de tentativas.
     */
    public Tentativas() {
        atual = maximo;
    }
    
    /**
     * @return A quantidade atual de tentativas restantes.
     */
    public int atual(){
        return atual;
    }
    
    /**
     * Diminui a quantidade de tentativas em 1 se ainda houverem tentativas.
     */
    public void errou(){
        if(atual > 0)
            atual--;       
    }
    
    /**
     * @return true caso a quantidade de tentativas seja zero.
     */
    public boolean acabou(){
        return atual == 0;
    }
}
