package br.ufpb.dcx.nailton.atividadesPOO.Biblioteca;
import java.util.Objects;

public class Publicacoes {
    private String nomeDoMaterial;
    private String altor;
    private Double preco;
    private String codigo;

    public Publicacoes(String nomeDoLivro, String nomeDoAltor, double preco, String codigo){
        this.nomeDoMaterial = nomeDoLivro;
        this.altor = nomeDoAltor;
        this.preco = preco;
        this.codigo = codigo;
    }
    public Publicacoes(){this("","",0.0,"");}
    public String getNomeDoMaterial() {
        return nomeDoMaterial;
    }

    public void setNomeDoMaterial(String nomeDoMaterial) {
        this.nomeDoMaterial = nomeDoMaterial;
    }
    public String getAltor(){
        return altor;
    }
    public void setAltor(String altor){
        this.altor = altor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacoes livro = (Publicacoes) o;
        return Objects.equals(codigo, livro.codigo) && Objects.equals(altor, livro.altor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Livro: "+ nomeDoMaterial +"\nAltor: "+ altor+"\nPreço: "+preco;
    }
}
