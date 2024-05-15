package entidade;

import modelos.Conta;

public class ContaPessoaFisica implements Conta {
	
	private int numeroConta;
	private String agencia;
	private String nomeProprietario;
	private double saldo;
	
	public ContaPessoaFisica(int numeroConta, String agencia, String nomeProprietario, double saldo) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.nomeProprietario = nomeProprietario;
		this.saldo = saldo;
	}

	@Override
	public int getNumeroConta() {
		return numeroConta;
	}
	
	@Override
	public String getAgencia() {
		return agencia;
	}
	
	@Override
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	
	
	@Override
	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valorSaque) {
		
		if(valorSaque > saldo) {
			
			System.out.println("Saldo insuficiente! Seu saldo é: " + saldo + " reais");
		}
		else {
			saldo = saldo - valorSaque;
			System.out.println("Saque realizado com sucesso! Seu saldo0 agora é de: " + saldo + " reais");
		}
	}

}