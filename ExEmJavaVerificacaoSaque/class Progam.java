import java.util.Scanner;

public class Program{
  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
      
        int saldoTotal = scanner.nextInt();

        int valorSaque = scanner.nextInt();
        
        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
        
        if(saldoTotal<valorSaque){
          
          System.out.println("Saldo insuficiente. Saque nao realizado!");
          
        }
        else{
          
          saldoTotal = saldoTotal - valorSaque;
          System.out.println("Saque realizado com sucesso!. Novo saldo = " + saldoTotal);
          
        }
    }
}
