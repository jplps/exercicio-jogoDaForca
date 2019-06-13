package modelo;

import modelo.interfaces.ObservadorTentativa;

/**
 * Uma representação para o boneco do jogo da forca.
 *
 * @author Joao e Marcelo
 */
public class Tentativas {

    public static final int maximo = 6;
    private int atual;
    private ObservadorTentativa observador;

    /**
     * Cria um novo objeto com o máximo de tentativas.
     */
    public Tentativas() {
        atual = maximo;
    }

    /**
     * @return A quantidade atual de tentativas restantes.
     */
    public int atual() {
        return atual;
    }

    /**
     * Diminui a quantidade de tentativas em 1 se ainda houverem tentativas.
     */
    public void errou() {
        if (atual > 0) {
            atual--;
            if (observador != null) {
                observador.atualizar(this);
            }
        }
    }

    /**
     * @return true caso a quantidade de tentativas seja zero.
     */
    public boolean acabou() {
        return atual == 0;
    }

    public void registrarObservador(ObservadorTentativa obs) {

        observador = obs;
    }
}
