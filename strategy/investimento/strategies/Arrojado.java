package strategy.investimento.strategies;

import java.util.Random;

import strategy.investimento.Conta;
import strategy.investimento.Investimento;

public class Arrojado implements Investimento {

    @Override
    public double calcula(Conta conta) {
        int random = new Random().nextInt(10);

        if (random >= 0 && random <= 1) {
            return conta.getSaldo() * 0.05;
        }

        if (random >= 2 && random <= 4) {
            return conta.getSaldo() * 0.03;
        }

        return conta.getSaldo() * 0.06;
    }

}
