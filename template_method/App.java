package template_method;

import template_method.impostos.ICPP;
import template_method.impostos.IKCV;
import template_method.impostos.Imposto;

public class App {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(550.0);
        orcamento.adicionar(new Item("caneta", 300.0));
        orcamento.adicionar(new Item("lapis", 250.0));

        Imposto ICPP = new ICPP();
        Imposto IKCV = new IKCV();

        double total1 = ICPP.calcula(orcamento);
        double total2 = IKCV.calcula(orcamento);

        System.out.println(String.format("%.2f", total1));
        System.out.println(String.format("%.2f", total2));
    }
}
