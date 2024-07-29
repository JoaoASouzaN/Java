package strategy;

public class Robo{

   private Strategy strategy;

   public void setComportamento(Strategy strategy){
   
      this.strategy = strategy;
   
   }
   
   public void mover(){
   
      strategy.mover();
   
   }

}