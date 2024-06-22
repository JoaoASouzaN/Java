# Verificador de Idade para Conta Bancáriaa

/*
 *  Descrição
 *  Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos.
 *
 *  Entrada
 *  O programa solicitará ao usuário que digite o número da conta bancária.
 *
 *  Saída
 *  -  O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.
 *  -  Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
 *  -  Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException) e informará que o número da conta é inválido.
 *  
 *  Exemplos:
 *  A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
 *-----------------------------------------------------------------------|
 *  Entrada  |                           Saída                           |
 *-----------------------------------------------------------------------|
 *  17       |  Voce nao esta elegivel para criar uma conta bancaria.    |
 *-----------------------------------------------------------------------|
 *  26       |  Voce esta elegivel para criar uma conta bancaria.        |
 *-----------------------------------------------------------------------|
 *  18       |  Voce esta elegivel para criar uma conta bancaria.        |
 *-----------------------------------------------------------------------|
 */

import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        // Verificar se a idade do cliente
        if(idade<18){
          System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }
        // Caso contrário, imprimir "Voce nao esta elegivel para criar uma conta bancaria."
        
        else{  
          System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }
        // Se >= 18, imprimir "Voce esta elegivel para criar uma conta bancaria."

        scanner.close();
        // Fechar o scanner para evitar vazamentos de recursos
    }
}
