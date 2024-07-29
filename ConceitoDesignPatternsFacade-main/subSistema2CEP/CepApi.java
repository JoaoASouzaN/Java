package subSistema2CEP;


public class CepApi{


   private static CepApi instancia = new CepApi();
   
   private CepApi(){
   
      super();
   
   }
   
   public static CepApi getInstancia(){
   
      return instancia;
   
   }
   
   public String recuperarCidade( String CEP){
   
      return "Araraquara";
   
   }
   
   public String recuperarEstado( String CEP){
   
      return "Sao Paulo";
   
   }

}