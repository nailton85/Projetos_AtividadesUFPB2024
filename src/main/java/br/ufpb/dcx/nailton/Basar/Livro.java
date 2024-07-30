package br.ufpb.dcx.nailton.Basar;
import java.util.Objects;

public class Livro extends Doacao{
    private String nomeDoLivro;
    private String nomeDoAltor;
    private String tipoDoLivro;

    public Livro(String estadoDeComservacao, double preco, String nomeDoLivro, String nomeDoAltor, String tipoDoLivro){
        super(estadoDeComservacao, preco);
        this.nomeDoLivro = nomeDoLivro;
        this.nomeDoAltor = nomeDoAltor;
        this.tipoDoLivro = tipoDoLivro;
    }
    public Livro(){
        this("",0.0,"","","");
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }
    public String getNomeDoAltor(){
        return nomeDoAltor;
    }
    public void setNomeDoAltor(String nomeDoAltor){
        this.nomeDoAltor = nomeDoAltor;
    }

    public String getTipoDoLivro() {
        return tipoDoLivro;
    }

    public void setTipoDoLivro(String tipoDoLivro) {
        this.tipoDoLivro = tipoDoLivro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDoLivro, nomeDoAltor, tipoDoLivro);
    }

    @Override
    public String toString() {
        return "Livro: "+nomeDoLivro+"\nAltor: "+nomeDoAltor+"\nGenero: "+tipoDoLivro+"\nPreço: ";

    }
}
