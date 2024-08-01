package br.ufpb.dcx.nailton.Biblioteca;
import java.util.Objects;

public class Livro{
    private String nomeDoLivro;
    private String Altor;
    private String tipoDoLivro;

    public Livro(String nomeDoLivro, String nomeDoAltor, String tipoDoLivro){
        this.nomeDoLivro = nomeDoLivro;
        this.Altor = nomeDoAltor;
        this.tipoDoLivro = tipoDoLivro;
    }
    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }
    public String getAltor(){
        return Altor;
    }
    public void setAltor(String altor){
        this.Altor = altor;
    }

    public String getTipoDoLivro() {
        return tipoDoLivro;
    }

    public void setTipoDoLivro(String tipoDoLivro) {
        this.tipoDoLivro = tipoDoLivro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDoLivro, Altor, tipoDoLivro);
    }

    @Override
    public String toString() {
        return "Livro: "+nomeDoLivro+"\nAltor: "+ Altor +"\nGenero: "+tipoDoLivro+"\nPreço: ";

    }
}
