package modelo;

/**
 *
 * @author alunos
 */
public class Letra {
    public final char caracter;
    
    public Letra(char l){
        caracter = Character.toUpperCase(l);
        validar();
    }
    
    private void validar(){
        if(!(caracter >= 'A' && caracter <= 'Z'))
            throw new IllegalArgumentException("A letra não é válida.");            
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Letra){
            Letra l = (Letra)obj;
            return l.caracter == caracter;
        }
        return false;
    }
    
    
    
}
