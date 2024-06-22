package calculos;

public class CalculoContar{

   private int parametroUm;
   private int parametroDois;
	
	public CalculoContar(int parametroUm, int parametroDois){
		this.parametroUm = parametroUm;
		this.parametroDois = parametroDois;
	}
	
	public int Calcular(){
		return parametroDois - parametroUm;
	}
}