package aplicacao;

import java.util.Scanner;
import exceptions.BusinessException;
import calculos.CalculoContar;

public class Contador{

	public static void main(String[] args){
		
      Scanner sc = new Scanner(System.in);
		
		int parametroUm;
		int parametroDois;
		int resultado;
		
      try{
   		System.out.println("Digite o primeiro parametro");
   		parametroUm = sc.nextInt();
   		
   		System.out.println("Digite o segundo parametro");
   		parametroDois = sc.nextInt();
         
         if(parametroDois < parametroUm){
            throw new BusinessException("O segundo parametro deve ser maior que o primeiro");
         }
         else{
            CalculoContar calculo = new CalculoContar(parametroUm, parametroDois);
            resultado = calculo.Calcular();
            
            for(int i = 1; i <= resultado; i++){
               System.out.println(i);
            }
         }
		}
      catch (BusinessException exception){
            System.out.println(exception.getMessage());
      }	
	}
}