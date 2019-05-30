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
public class Segredo {

    private final Palavra palavra;
    private final ArrayList<Espaco> espacos;

    public Segredo(String s) {
        espacos = new ArrayList();

        palavra = new Palavra(s);
        criarEspacos(s);
    }

    public void criarEspacos(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            espacos.add(new Espaco(c));
        }
    }

    private void revelarEspacos(ArrayList<Integer> indices) {
        for (Integer indice : indices) {
            espacos.get(indice).revelar();
        }
    }

    public boolean receberLetra(Letra l) {
        if (l == null) {
            throw new IllegalArgumentException("O segredo não pode receber uma letra nula");
        }
        ArrayList<Integer> indices = palavra.temLetra(l);
        revelarEspacos(indices);
        return !indices.isEmpty();
    }

}
