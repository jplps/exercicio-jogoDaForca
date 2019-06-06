/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Representa um espaço onde um caracter pode estar escondido ou revelado ao jogador.
 * @author Natalia e Carlos
 */
public class Espaco {

    public final char caracter;
    public final static char branco = '_';
    private boolean revelado;

    /**
     * Cria um novo objeto da classe Espaço para conter um caracter escondido.
     * @param c O caracter base.
     */
    public Espaco(char c) {
        revelado = false;
        caracter = c;
    }

    /**
     * Muda o estado do espaço para notificar que a letra deve ser revelada ao jogador.
     */
    public void revelar() {
        revelado = true;
    }

    /**
     * @return O estado atual do espaço.
     */
    public boolean revelado() {
        return revelado;
    }

    /**
     * @return Um caracter ou um espaço em branco conforme o estado interno do objeto.
     */
    @Override
    public String toString() {
        if (revelado) {
            return "" + caracter;
        }
        return "" + branco;
    }

}
