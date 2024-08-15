package br.ufpb.dcx.nailton.atividadesPOO.TesteDeCodigoSimples;

record Retangulo(double base, double altura){
    public Retangulo{
        if(base<=0 || altura <=0){
            throw new java.lang.IllegalArgumentException(String.format("Dimensões invalidas: " + base, altura));
        }
    }
    static double baseIdeal;
    static {
        baseIdeal = 10;
    }
    public static Retangulo criarRetanguloIdeal(double altura){
        return new Retangulo(baseIdeal, altura);
    }
}
