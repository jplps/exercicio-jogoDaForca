package modelo;

/**
 * Uma letra no jogo da forca
 * @author João, Carlos, Natalia e Marcelo
 */
public class Letra {
    public final char caracter;
    
    /**
     * Constroi um objeto letra com base em um caracter
     * @param l O caracter base
     */
    public Letra(char l){
        caracter = Character.toUpperCase(l);
        validar();
    }
    
    /**
     * Valida o caracter para checar se ele é uma letra do alfabeto
     * @throws IllegalArgumentException quando o caracter não pertence ao alfabeto.
     */
    private void validar(){
        if(!(caracter >= 'A' && caracter <= 'Z'))
            throw new IllegalArgumentException("A letra não é válida.");            
    }

    /**
     * Verifica a igualdade entre duas letras.
     * @param obj Outro objeto a ser testado.
     * @return True quando os caracteres de duas letras forem iguais.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Letra){
            Letra l = (Letra)obj;
            return l.caracter == caracter;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "" + caracter;
        return s;
    }
    
}
