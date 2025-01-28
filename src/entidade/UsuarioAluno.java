package entidade;

public class UsuarioAluno extends Usuario {
    //duvida: devo colocar o atributo curso no construtor juntamente com os atributos recebidos da classe pai?
    //duvida: a estrutura do código está correta?s 

    protected String curso;
    
    // Construtor para UsarioAluno com os atributos basicos recebidos da classe pai. 
    public UsuarioAluno(int cpf, String nome, String endereco, int telefone, String email, String matricula) {
            super(cpf, nome, endereco, telefone, email, matricula);  
            //O super chama o construtor da classe pai para garantir que os atributos básicos sejam inicializados corretamente.
            
        }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    
    
}
