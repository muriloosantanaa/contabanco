import java.util.Scanner;

public class contaTerminal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner ler = new Scanner(System.in);
				
		int num;
		System.out.println("Digite o número da conta:\n");
		num = ler.nextInt();
		
		String ag;
		System.out.println("Digite o número da agência:\n");
		ag = ler.next();
		
		String nome;
		System.out.println("Digite o nome do cliente:\n");
		nome = ler.next();
		
		String sobrenome;
		System.out.println("Digite o sobrenome do cliente:\n");
		sobrenome = ler.next();
		
		double saldo = 0;
		System.out.println("Valor de depósito:\n");
		saldo = ler.nextDouble();

		System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + ag + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque.");

	}

}