package chain_of_responsability;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private final double valor;
    private List<Item> itens = new ArrayList<>();

    public Orcamento(
            double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }

}
