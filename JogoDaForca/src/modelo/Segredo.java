/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 * Representa a palavra escondida do jogador em um jogo da forca.
 * @author Natalia e Carlos
 */
public class Segredo {

    private final Palavra palavra;
    private final ArrayList<Espaco> espacos;

    /**
     * Constroi um objeto da classe Segredo a partir de uma String base.
     * @param s A string que será usada para criar a palavra.
     */
    public Segredo(String s) {
        espacos = new ArrayList();

        palavra = new Palavra(s);
        criarEspacos(s);
    }

    /**
     * Verifica se a palavra tem a letra l e revela seus espaços onde essa letra existe.
     * @throws IllegalArgumentException se a letra for nula.
     * @param l Uma letra.
     * @return true se algum espaço foi revelado.
     */
    public boolean receberLetra(Letra l) {
        if (l == null) {
            throw new IllegalArgumentException("O segredo não pode receber uma letra nula");
        }
        ArrayList<Integer> indices = palavra.temLetra(l);
        revelarEspacos(indices);
        return !indices.isEmpty();
    }

    /**
     * Cria um espaço para cada caracter da palavra e os adiciona na lista de espaços do segredo
     * @param s Uma palavra representada como uma String.
     */
    private void criarEspacos(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            espacos.add(new Espaco(c));
        }
    }
    
    /**
     * Revela os espaços segundo os indices.
     * @param indices Os indices que serão revelados.
     */
    private void revelarEspacos(ArrayList<Integer> indices) {
        for (Integer indice : indices) {
            espacos.get(indice).revelar();
        }
    }
}
