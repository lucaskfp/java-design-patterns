package strategy.imposto.strategies;

import strategy.imposto.Imposto;
import strategy.imposto.Orcamento;

public class ISS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

}
