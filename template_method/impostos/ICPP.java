package template_method.impostos;

import template_method.Orcamento;

public class ICPP extends ImpostoTemplate {

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        if (orcamento.getValor() >= 500) {
            return true;
        }

        return false;
    }

}
