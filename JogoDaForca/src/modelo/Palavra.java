/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 * Representa uma palavra no jogo da forca.
 * @author Natalia e Carlos
 */
public class Palavra {

    private final ArrayList<Letra> letras;

    /**
     * Constrói um objeto palavra a partir de uma String.
     * @param s A string base para construir a palavra.
     */
    public Palavra(String s) {

        validar();
        letras = new ArrayList();
        criarLetras(s);
    }

    /**
     * Obtem cada caracter da String s e cria letras para adicionar na lista de letras da palavra.
     * @param s A String base que cria a palavra.
     */
    private void criarLetras(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letras.add(new Letra(c));
        }
    }

    /**
     * Verifica se uma letra é valida.
     * @throws IllegalArgumentException se a palavra for nula ou vazia.
     */
    private void validar() {
        if (letras == null || letras.isEmpty()) {
            throw new IllegalArgumentException("A palavra não é valida!");
        }
    }

    /**
     * Obtem uma lista de indices onde a letra l está presente.
     * @param l A letra a qual a busca é feita.
     * @return Uma lista de indicies.
     */
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
