package br.ufpb.dcx.nailton.atividadesPOO.Biblioteca;

import java.util.List;

public class SistemaBibliotecaCentral implements SistemaBiblioteca {
    @Override
    public void cadastraItem(Publicacoes item) throws CodigoInvalidoException, ItemInexistenteException {

    }

    @Override
    public List<Publicacoes> pesquisaItensPeloNome(String nome) {
        return null;
    }

    @Override
    public List<Publicacoes> pesquisaItensAbaixoDoPreco(double preco) {
        return null;
    }

    @Override
    public Publicacoes pesquisaItemPeloCodigo(String codigo) throws ItemInexistenteException {
        return null;
    }
}
