package chain_of_responsability;

import java.util.Collections;
import java.util.List;

public class Orcamento {
    private final double valor;
    private List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }

}
