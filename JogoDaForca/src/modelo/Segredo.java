/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import modelo.interfaces.ObservadorSegredo;

/**
 * Representa a palavra escondida do jogador em um jogo da forca.
 * @author Natalia e Carlos
 */
public class Segredo {

    private final Palavra palavra;
    private final ArrayList<Espaco> espacos;
    private ObservadorSegredo observador;

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
     * Verifica se o jogo já terminou.
     * @return False se pelo menos um dos espaços aindo não foi revelado.
     */
    public boolean vitoria(){
        for(Espaco e : espacos)
            if(!e.revelado())
                return false;
        return true;
    }
    
    /**
     * Registra um observador de segredo
     * @param obs - um ObservadorSegredo
     */
    public void registrarObservador(ObservadorSegredo obs){
        observador = obs;
    }
    
    /**
     * Sobrescreve o método para retornar "_" ou "char"
     * @return 
     */
    @Override
    public String toString() {
        String s = "";
        for(Espaco e : espacos)
            s += " " + e.toString();
        return s;
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
        if(observador != null)
            observador.atualizar(this);
    }
}
