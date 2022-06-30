package chain_of_responsability.strategies;

import chain_of_responsability.Desconto;
import chain_of_responsability.Orcamento;

public class DescontoPorCincoItens implements Desconto {

    private Desconto proximo;

    @Override
    public double desconto(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        }
        return this.proximo.desconto(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

}
