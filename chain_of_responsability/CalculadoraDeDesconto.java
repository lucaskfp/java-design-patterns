package chain_of_responsability;

import chain_of_responsability.strategies.DescontoPorCincoItens;
import chain_of_responsability.strategies.DescontoPorMaisDeQuinhentosReais;
import chain_of_responsability.strategies.SemDesconto;

public class CalculadoraDeDesconto {

    public double calcula(Orcamento orcamento) {
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);

        return d1.desconto(orcamento);
    }
}
