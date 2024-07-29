package estilo;

public class Separador{

   private String separador;
   private int tamanhoNome;
   private int tamanhoSeparador;
   
   public Separador(){
   
      
   
   }
   
   public void separarPersonalizado(String nomeTopico , int tamanho){
   
      tamanhoNome = nomeTopico.length();
      
      tamanhoSeparador = tamanho - tamanhoNome;
      
      if(tamanhoSeparador % 2 != 0){
      
         tamanhoSeparador = tamanhoSeparador + 1;
      
      }
      
      tamanhoSeparador = tamanhoSeparador/2;
      
      System.out.println(" ");
      
      for(int i=0; i< tamanhoSeparador; i++){
      
         System.out.printf("-");
      
      }
      
      System.out.printf(" " + nomeTopico + " ");
      
      for(int i=0; i< tamanhoSeparador; i++){
      
         System.out.printf("-");
      
      }
      
      System.out.println("\n ");
   
   }

}