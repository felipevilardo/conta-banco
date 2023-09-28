import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Valores padrão
        String agencia = "067-8";
        int conta = 1021;
        String cliente = "MARIO ANDRADE";
        double saldo = 237.48;

        // Solicita ao usuário que digite o Número da Conta
        System.out.print("Por favor, digite o número da conta e pressione ENTER: ");
        int numeroConta = scanner.nextInt();

        // Consumir a quebra de linha pendente
        scanner.nextLine();

        // Solicita ao usuário que digite o número da agência
        System.out.print("Por favor, digite o número da Agência e pressione ENTER: ");
        String numeroAgencia = scanner.nextLine();

        // Solicita ao usuário que digite o Nome do Cliente
        System.out.print("Por favor, digite o Nome do Cliente e pressione ENTER: ");
        String nomeCliente = scanner.nextLine();

        // Solicita ao usuário que digite o Saldo 
        System.out.print("Por favor, digite o saldo e pressione ENTER: ");
        double saldoAtual = scanner.nextDouble();

        System.out.println("Número Conta: " + numeroConta);
        System.out.println("Agência: " + numeroAgencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldoAtual);

        scanner.close();

        System.out.println("Olá, " + cliente + "! Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", Conta: " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}