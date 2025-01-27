package entidade;

public class Usuario { //Atributos: caracteristcas do objeto
    protected int cpf; //duvida: devo acrescentar a constante final?
    protected String nome;
    protected String endereco;
    protected int telefone;
    protected String email;
    protected String matricula;

    public Usuario(int cpf, String nome, String endereco, int telefone, String email, String matricula) { 
        //Contrutor: tudo que o objeto precisa para ser construido
    
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }
//metodos acessores dos atributos:S getters (consulta e retorna) e setters (modifica) 
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    



    
}