package entidade;


public class Livro {
    private int isbn;
    private String titulo;
    private String nome;
    private String autor;
    private String editora;
    private int numpages;
    private int quantidade;



    public Livro(int isbn, String titulo, String nome, String autor, String editora, int numpages, int quantidade) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.numpages = numpages;
        this.quantidade = quantidade;
    }


    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumpages() {
        return numpages;
    }
    public void setNumpages(int numpages) {
        this.numpages = numpages;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

     // Método que decremente a quantidade de livros disponíveis
    public boolean emprestarLivro() {
        if (quantidade > 0) {
            quantidade--;  // Decrementa a quantidade de livros disponíveis
            return true;    // Emprestimo bem-sucedido
        }
        return false;  // Não há livros disponíveis para empréstimo
    }

    // Método que retorna o livro, incrementando a quantidade
    public void devolverLivro() {
        quantidade++;  // Incrementa a quantidade de livros disponíveis
    }
    
    
    
}

