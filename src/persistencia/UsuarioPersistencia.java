package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import entidade.Usuario;

public class UsuarioPersistencia {
    
    private static final String ARQUIVO = "usuarios.bin";
    private List<Usuario> usuarios;

    public UsuarioPersistencia (){
        this.usuarios = new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void salvaUsuarios() {
        try (
            FileOutputStream fos = new FileOutputStream(ARQUIVO);
            ObjectOutputStream ous = new ObjectOutputStream(fos)
        ) {
            ous.writeObject(usuarios);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void carregaUsuario() {
        try(
            FileInputStream fis = new FileInputStream(ARQUIVO);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            usuarios = (List<Usuario>) ois.readObject();
        } catch (IOException | ClassNotFoundException  e) {
            e.printStackTrace();
        }
    }
    
}
