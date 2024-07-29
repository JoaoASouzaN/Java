package facade;

import subSistema1CRM.*;
import subSistema2CEP.*;

public class Facade{

   public void migrarCliente(String nomeCliente, String CEP){
   
      String cidade = CepApi.getInstancia().recuperarCidade(CEP);
      String estado = CepApi.getInstancia().recuperarEstado(CEP);
      
      CrmService.gravarCliente(nomeCliente, CEP, cidade, estado);
         
   }

}