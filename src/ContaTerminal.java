import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Declarando variáveis para armazenar os dados da conta
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Recebendo os dados da conta via terminal
        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();

        // Consumir a quebra de linha pendente
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        saldo = scanner.nextDouble();

        // Exibindo as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta número " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}