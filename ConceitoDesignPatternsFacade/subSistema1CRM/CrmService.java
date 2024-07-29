package subSistema1CRM;

public class CrmService{

   private CrmService(){
   
      super();
   
   }

   public static void gravarCliente(String nomeCliente, String CEP, String cidade, String estado){
   
      System.out.println("Cliente salvo no sistema de CRM.");
      System.out.println("Nome: " + nomeCliente);
      System.out.println("CEP: " + CEP);
      System.out.println("Cidade: " + cidade);
      System.out.println("Estado: " + estado);
   
   }

}