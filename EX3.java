import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.print("Digite o valor que recebe por hora: ");
        double valorPorHora = scanner.nextDouble();
        
        double salario = horasTrabalhadas * valorPorHora;
        
        System.out.printf("Salário do funcionário: R$ %.2f\n", salario);
    }
}
