import javax.swing.JOptionPane;

public class DescontoProduto {
    public static void main(String[] args) {
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
        String inputValor = JOptionPane.showInputDialog("Digite o valor do produto:");
        double valorProduto = Double.parseDouble(inputValor);
        String inputDesconto = JOptionPane.showInputDialog("Digite o desconto percentual:");
        double desconto = Double.parseDouble(inputDesconto);
        
        double valorDesconto = valorProduto * (desconto / 100);
        double valorComDesconto = valorProduto - valorDesconto;
        
        JOptionPane.showMessageDialog(null, String.format("Produto: %s\nValor original: R$ %.3f\nValor com desconto: R$ %.3f", nomeProduto, valorProduto, valorComDesconto));
    }
}
