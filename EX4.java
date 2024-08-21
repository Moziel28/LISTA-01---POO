import javax.swing.JOptionPane;

public class NomeIdade {
    public static void main(String[] args) {
        int anoAtual = 2024; // ou use uma biblioteca para obter o ano atual dinamicamente
        
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String inputAnoNascimento = JOptionPane.showInputDialog("Digite seu ano de nascimento:");
        int anoNascimento = Integer.parseInt(inputAnoNascimento);
        int idade = anoAtual - anoNascimento;
        
        JOptionPane.showMessageDialog(null, String.format("Você se chama %s e possui %d anos de idade!", nome, idade));
    }
}
