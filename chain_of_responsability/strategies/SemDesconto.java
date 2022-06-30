package chain_of_responsability.strategies;

import chain_of_responsability.Desconto;
import chain_of_responsability.Orcamento;

public class SemDesconto implements Desconto {

    @Override
    public double desconto(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {

    }

}
