package chain_of_responsability;

public class App {
    public static void main(String[] args) {
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Orcamento orcamento = new Orcamento(550.0);

        orcamento.adicionaItem(new Item("caneta", 250.0));
        orcamento.adicionaItem(new Item("lapis", 300.0));

        double descontoFinal = calculadoraDeDesconto.calcula(orcamento);

        System.out.println(descontoFinal);
    }
}
