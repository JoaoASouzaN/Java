package aplicacao;

import java.util.Scanner;
import entidade.ContaPessoaFisica;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da sua conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Digite o numero da agencia: ");
		String agencia = sc.next();
		
		System.out.println("Digite o nome do prorpietario da conta: ");
		String nomeProp = sc.next();
		
		System.out.println("Digite o valor do depositoa: ");
		double saldo = sc.nextDouble();

		ContaPessoaFisica PF = new ContaPessoaFisica(numeroConta, agencia, nomeProp, saldo);
		
		PF.sacar(200.00);
		
		sc.close();
	}

}