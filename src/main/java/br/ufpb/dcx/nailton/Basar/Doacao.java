package br.ufpb.dcx.nailton.Basar;

public abstract class Doacao {
    private String estadoDeConservacao;
    private double preco;

    public Doacao(String estadoDeConservacao, double preco){
        this.estadoDeConservacao = estadoDeConservacao;
        this.preco = preco;
    }
    public Doacao(){this("",0.0);}

    public String getEstadoDeConservacao() {
        return estadoDeConservacao;
    }

    public void setEstadoDeConservacao(String estadoDeConservacao) {
        this.estadoDeConservacao = estadoDeConservacao;
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
