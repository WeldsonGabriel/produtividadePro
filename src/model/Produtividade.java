package model;

public class Produtividade {
    private double tempoPlanejado;
    private double tempoGasto;

    public Produtividade(double tempoPlanejado, double tempoGasto) {
        this.tempoPlanejado = tempoPlanejado;
        this.tempoGasto = tempoGasto;
    }

    public double calcularPorcentagem() {
        if (tempoPlanejado <= 0) return 0;
        return (tempoGasto / tempoPlanejado) * 100;
    }

    public String gerarGrafico() {
        double porcentagem = calcularPorcentagem();
        int blocosCheios = (int) (porcentagem / 5); // 20 blocos totais
        int blocosVazios = 20 - blocosCheios;
        return "[" + "█".repeat(blocosCheios) + "-".repeat(blocosVazios) + "]";
    }

    @Override
    public String toString() {
        double porcentagem = calcularPorcentagem();
        return String.format("Produtividade: %.2f%% %nGráfico: %s", porcentagem, gerarGrafico());
    }
}

