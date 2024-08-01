package br.ufpb.dcx.nailton.Basar;

import java.util.List;

public interface SistemaBasar {
    /**
     * Cadastra um novo item no sistema.
     * @param item O item a ser adicionado
     *
     */
    public void cadastraItem(Doacao item) throws CodigoInvalidoException;

    /**
     * Pesquisa todos os itens cujo nome começa com o nome passado como parâmetro
     * @param nome O nome a pesquisar
     * @return uma lista contendo os itens cujo nome começa com o parâmetro passado.
     */
    public List<Doacao> pesquisaItensPeloNome(String nome);

    /**
     * Pesquisa os itens cujo preço é menor ou igual ao valor passado no parâmetro
     * @param preco O valor dos itens a pesquisar
     * @return a lista dos itens cujo preço é menor ou igual ao valor passado no parâmetro.
     */
    public List<Doacao> pesquisaItensAbaixoDoPreco(double preco);

    /**
     * Pesquisa o item cujo código é passado por parâmetro.
     * @param codigo O código do item a pesquisar
     * @return o item encontrado.
     * @throws ItemInexistenteException Se não for encontrado nenhum item com o código passado.
     */
    public Doacao pesquisaItemPeloCodigo(String codigo) throws ItemInexistenteException;

    /**
     * Adiciona um item a uma
     * @param item
     * @return a quantidade atualizada.
     */
    public Doacao AdiionaItemAoEstoque(Doacao item);

    /**
     *
     * @param Item
     * @return
     */
    public Doacao RemoveItemDoEstoque(Doacao Item);

}
