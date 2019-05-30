package modelo;

/**
 *
 * @author alunos
 */
public class Letra {
    public final char representacao;
    
    public Letra(char l){
        representacao = Character.toUpperCase(l);
        validar();
    }
    
    private void validar(){
        if(!(representacao >= 'A' && representacao <= 'Z'))
            throw new IllegalArgumentException("A letra não é válida.");            
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Letra){
            Letra l = (Letra)obj;
            return l.representacao == representacao;
        }
        return false;
    }
    
    
    
}
