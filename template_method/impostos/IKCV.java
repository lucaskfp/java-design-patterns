package template_method.impostos;

import template_method.Orcamento;

public class IKCV extends ImpostoTemplate {

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        if (orcamento.getValor() > 500 && orcamento.possuiItemMaiorQue(100.0)) {
            return true;
        }

        return false;
    }

}
