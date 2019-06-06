package modelo;

import static modelo.EstadoPartida.DERROTA;
import static modelo.EstadoPartida.INACABADO;
import static modelo.EstadoPartida.VITORIA;

/**
 * Representa uma partida no jogo da forca.
 *
 * @author Joao, Marcelo, Natalia
 */
public class Partida {

    public final Segredo segredo;
    public final LetrasUsadas letrasusadas;
    public final Tentativas tentativas;

    /**
     * Começa uma partida com uma palavra de segredo
     *
     * @param segredo A string que cria a palavra.
     */
    public Partida(String segredo) {
        this.segredo = new Segredo(segredo);
        letrasusadas = new LetrasUsadas();
        tentativas = new Tentativas();
    }

    /**
     * Verifica o estado atual da partida.
     *
     * @return Estado atual da partida.
     */
    public EstadoPartida estado() {
        if (segredo.vitoria()) {
            return VITORIA;
        }
        if (tentativas.acabou()) {
            return DERROTA;
        }
        return INACABADO;
    }

    /**
     * Registra a letra no contexto de letras usadas e revela os espaços do
     * segredo.
     *
     * @throws IllegalArgumentException se o Segredo for nulo.
     * @param s Um segredo para aplicar a jogada.
     * @return true caso algum espaço foi revelado.
     */
    public void jogar(char c) {
        if (estado() != INACABADO) {
            throw new IllegalStateException("O jogo já acabou.");
        }
        Letra l = new Letra(c);

        if (letrasusadas.usada(l)) {
            throw new IllegalArgumentException("A letra já foi usada");
        }
        efetuarJogada(l);
    }
    /**
     * Realizar de fato a jogada no jogo da forca.
     * @param l A letra escolhida pelo usuário
     */
    private void efetuarJogada(Letra l) {
        letrasusadas.registrarLetra(l);
        if (!segredo.receberLetra(l)) {
            tentativas.errou();
        }
    }
}
