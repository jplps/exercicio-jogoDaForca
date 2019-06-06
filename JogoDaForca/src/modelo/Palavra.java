/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Palavra {

    private final ArrayList<Letra> letras;

    public Palavra(String s) {

        validar();
        letras = new ArrayList();
        criarLetras(s);
    }

    private void criarLetras(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letras.add(new Letra(c));
        }
    }

    private void validar() {
        if (letras == null || letras.isEmpty()) {
            throw new IllegalArgumentException("A palavra não é valida!");
        }
    }

    public ArrayList<Integer> temLetra(Letra l) {

        ArrayList<Integer> indices = new ArrayList();
        int i = 0;
        for (Letra a : letras) {
            if (a.equals(l)) {
                indices.add(i);
            }
            i++;
        }
        return indices;
    }
}
