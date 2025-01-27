package entidade;

public class UsuarioServidor extends Usuario {

    protected String cargo;

    // Construtor para Usarioservidor com os atributos basicos recebidos da classe pai. 
    public UsuarioServidor(int cpf, String nome, String endereco, int telefone, String email, String matricula) {
            super(cpf, nome, endereco, telefone, email, matricula);
            //O super chama o construtor da classe pai para garantir que os atributos básicos sejam inicializados corretamente.
        
        }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
    
}
