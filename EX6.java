import javax.swing.JOptionPane;

public class AumentoSalario {
    public static void main(String[] args) {
        String inputSalario = JOptionPane.showInputDialog("Digite o salário do funcionário:");
        double salario = Double.parseDouble(inputSalario);
        
        double aumento = salario * 0.15;
        double salarioReajustado = salario + aumento;
        
        JOptionPane.showMessageDialog(null, String.format("Salário antigo: R$ %.2f\nSalário reajustado: R$ %.2f", salario, salarioReajustado));
    }
}
