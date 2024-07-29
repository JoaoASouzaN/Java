package singleton;

public class SingletonLazy{

   private static SingletonLazy instancia;
   
   private SingletonLazy(){
   
      super();
   
   }
   
   public static SingletonLazy getInstanciaLazy(){
   
      if(instancia == null){
      
         instancia = new SingletonLazy();
      
      }
      
      return instancia;
   
   }

}