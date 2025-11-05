package app;

import model.Produtividade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora de Produtividade ===");
        System.out.print("Digite o tempo planejado (em horas): ");
        double tempoPlanejado = scanner.nextDouble();

        System.out.print("Digite o tempo realmente gasto (em horas): ");
        double tempoGasto = scanner.nextDouble();

        Produtividade produtividade = new Produtividade(tempoPlanejado, tempoGasto);

        System.out.println("\n--- Resultado ---");
        System.out.println(produtividade);

        scanner.close();
    }
}
