/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.interfaces;

import modelo.Tentativas;

/**
 * Esta classe (interface) atualizará o número de tentativas restantes do
 * modelo.
 *
 * @author aluno
 */
public interface ObservadorTentativa {
    /**
     * Notifica o observador que uma tentativa foi modificada.
     * @param t é o objeto que sofreu alteração. 
     */
    public void atualizar(Tentativas t);
}
