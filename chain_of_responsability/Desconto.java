package chain_of_responsability;

public interface Desconto {
    double desconto(Orcamento orcamento);

    void setProximo(Desconto proximo);
}
