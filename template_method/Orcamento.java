package template_method;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private double valor;
    private List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public void adicionar(Item item) {
        this.itens.add(item);
    }

    public boolean possuiItemMaiorQue(double valor) {

        boolean possui = this.itens.stream().anyMatch(n -> n.getValor() > 100.0);

        if (possui) {
            return true;
        }

        return false;
    }

}
