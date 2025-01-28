package negocio;

import java.util.Collections;
import java.util.List;

import entidade.Livro;
import excecoes.EntidadeDuplicadaException;
import excecoes.EntidadeNaoEncontradaException;
import persistencia.LivroPersistencia;


public class LivroNegocio {

    private LivroPersistencia persistencia;

    public LivroNegocio() {
        this.persistencia = newLivroPersistencia();
        persistencia.carregaLivros();
    }

    public void salvarLivros() {
        persistencia.salvaLivros();
    }

    public void emprestarLivros
}
