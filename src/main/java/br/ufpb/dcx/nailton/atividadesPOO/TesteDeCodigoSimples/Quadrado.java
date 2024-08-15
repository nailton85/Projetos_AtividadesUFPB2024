package br.ufpb.dcx.nailton.atividadesPOO.TesteDeCodigoSimples;

record Quadrado(double Lado) {
    public Quadrado{
        if(Lado <= 0){
            throw new java.lang.IllegalArgumentException(String.format("Dimensões invalidas: "+Lado));
        }
    }

}
