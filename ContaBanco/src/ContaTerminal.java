
import java.math.BigDecimal;
import java.util.Scanner;
/**
 * Classe para simular um terminal bancário.
 * Permite ao usuário interagir com uma conta bancária.
 */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Santander!");
        System.out.print("Digite o número da conta: ");
        
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o nome da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        BigDecimal saldoInicial = scanner.nextBigDecimal();

        System.out.println("\nDados da Conta:");
        System.out.printf(
        "Olá, %s! Obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque. \n", nomeCliente, agencia, numeroConta, saldoInicial);

        scanner.close();
    }
}
