import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double[] valores = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }

        double media = soma / 5;

        System.out.println("Valores digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
        }
        System.out.println("Média aritmética: " + media);
    }
}
