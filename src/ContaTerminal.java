import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da conta: ");
		
		int numeroConta = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Por favor, digite o número da agência (formato: 067-8: ");
		String agencia = scanner.nextLine();
		
		System.out.println("Por favor, digite o nome do cliente: ");
		String nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o saldo da conta: ");
		double saldo = scanner.nextDouble();
		
		scanner.close();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f ja está disponivel para saque.%n,", nomeCliente, agencia, numeroConta, saldo);
	}

}
