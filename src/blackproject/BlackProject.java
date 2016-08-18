
package blackproject;

/**
 *
 * @author aluno
 */
public class BlackProject {

    private String nome = "";
    
    public BlackProject() {
    }
    
    public BlackProject(String nome) {
        this.nome = nome;
    }
    
    public String getMessage() {
        return ("Hello " + nome).trim();
    }
    
}
