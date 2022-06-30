package strategy.imposto;

public class CalculadoraDeImposto {

    public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
        return imposto.calcula(orcamento);
    }

}
