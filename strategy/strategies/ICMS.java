package strategy.strategies;

import strategy.Imposto;
import strategy.Orcamento;

public class ICMS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return (orcamento.getValor() * 0.05) + 50.0;
    }

}
