/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Espaco {

    public final char caracter;
    public final static char branco = '_';
    private boolean revelado;

    public Espaco(char c) {
        revelado = false;
        caracter = c;
    }

    public void revelar() {
        revelado = true;
    }

    public boolean revelado() {
        return revelado;
    }

    @Override
    public String toString() {
        if (revelado == true) {
            return "" + caracter;
        }
        return "" + branco;
    }

}
