import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o seu nome?");
		Cliente usuario = new Cliente();
		usuario.setNome(scanner.nextLine());

		System.out.println("Qual o tipo da Conta?");
		System.out.println("Opções validas: ContaCorrente, ContaPoupanca");
		String tipoConta = scanner.nextLine();

		if (tipoConta.equalsIgnoreCase("ContaCorrente")) {
			Conta CC = new ContaCorrente(usuario);
			System.out.println("Nova Conta Corrente Criada com sucesso!");

			CC.setSaldo(200);

			System.out.println("O que deseja fazer?");
			System.out.println("Saldo na conta: R$" + CC.saldo);
			System.out.println("Opções:Depositar, Sacar, ImprimirExtrato.");
			String funcao = scanner.nextLine();


			if(funcao.equalsIgnoreCase("depositar")) {
				System.out.println("Quanto deseja depositar?");
				double valorDeposito = scanner.nextDouble();
				CC.depositar(valorDeposito);
				System.out.println("deposito de: R$" + valorDeposito + " feito com sucesso!");
			}


			if(funcao.equalsIgnoreCase("sacar")){
				System.out.println("Quanto deseja Sacar?");
				double valorSaque = scanner.nextDouble();
				CC.sacar(valorSaque);

				if (CC.saldo < valorSaque) {
					System.out.println("Saldo na conta Insuficiente.");
				}

				System.out.println("Saque de: R$" + valorSaque + " feito com sucesso!");
			}


			if (funcao.equalsIgnoreCase("ImprimirExtrato")) {
				CC.imprimirInfosComuns();
				
			}
		}


		if (tipoConta.equalsIgnoreCase("ContaPoupanca")) {
			Conta CP = new ContaPoupanca(usuario);
			System.out.println("Nova Conta Poupança Criada com sucesso!");

			CP.setSaldo(300);

			System.out.println("O que deseja fazer?");
			System.out.println("Saldo na conta: R$" + CP.saldo);
			System.out.println("Opções:Depositar, Sacar, ImprimirExtrato.");
			String funcao = scanner.nextLine();


			if(funcao.equalsIgnoreCase("depositar")) {
				System.out.println("Quanto deseja depositar?");
				double valorDeposito = scanner.nextDouble();
				CP.depositar(valorDeposito);
				System.out.println("deposito de: R$" + valorDeposito + " feito com sucesso!");
			}


			if(funcao.equalsIgnoreCase("sacar")){
				System.out.println("Quanto deseja Sacar?");
				double valorSaque = scanner.nextDouble();
				CP.sacar(valorSaque);
				System.out.println("Saque de: R$" + valorSaque + " feito com sucesso!");

				if (CP.saldo < valorSaque) {
					System.out.println("Saldo na conta Insuficiente.");
				}
			}


			if (funcao.equalsIgnoreCase("ImprimirExtrato")) {
				CP.imprimirInfosComuns();
				
			}
		}


		/*Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();*/


		scanner.close();
	}

}
