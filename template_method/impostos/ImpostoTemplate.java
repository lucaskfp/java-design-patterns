package template_method.impostos;

import template_method.Orcamento;

public abstract class ImpostoTemplate implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        }

        return minimaTaxacao(orcamento);
    }

    public abstract double minimaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
