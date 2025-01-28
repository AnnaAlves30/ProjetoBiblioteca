package persistencia;

//leitura e escrita de dados em arquivos
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import entidade.Livro;

public class LivroPersistencia {

    private static final String ARQUIVO = "livros.bin";
    private List<Livro> livros; // lista para amarzenar os livros na memoria 

    public LivroPersistencia (){
        this.livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void salvaLivros() {
        try (
            FileOutputStream fos = new FileOutputStream(ARQUIVO);
            ObjectOutputStream ous = new ObjectOutputStream(fos)
        ) {
            ous.writeObject(livros);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void carregaLivros() {
        try(
            FileInputStream fis = new FileInputStream(ARQUIVO);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            livros = (List<Livro>) ois.readObject();
        } catch (IOException | ClassNotFoundException  e) {
            e.printStackTrace();
        }
    }

}
