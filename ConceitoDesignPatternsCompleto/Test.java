/*---------------------------------------------------------------------------------------*| 
|* Singleton:                                                                             |
|*                                                                                        |
|* Vem com a ideia de permitir a criação de uma unica instancia de uma determinada classe |
|* e fornecer um modo de recupera-la, possui três variaçoes diferentes.                   |
|*                                                                                        |
|* Variações:                                                                             |
|*                                                                                        |
|* 1-> o SingletonLazy "preguisoso", primeiro verifica se já foi instanciado para depois  |
|* instanciar.                                                                            |
|*                                                                                        |
|* 2-> já o SingletonEager "apressado", já faz a instanciação logo de cara                |
|* sem uma verificação previa.                                                            |
|*                                                                                        |
|* 3-> fica responsavel por incapsular o instancia dentro de uma classe estatica dentro   |
|* de si mesmo.                                                                           |
|*                                                                                        |
|*---------------------------------------------------------------------------------------*|
|* Strategy:                                                                              |
|*                                                                                        |
|* Possui a ideia de simplificar a variação de algoritmos/estrategias para a              |
|* resolução de um mesmo problema. Muito interressante quando é necessario a utilização   |
|* de diferentes maneiras mas seguindo um padrão comum.                                   |
|*                                                                                        |
|*---------------------------------------------------------------------------------------*|
|*                                                                                        |
|* Esse conceito é utilizado para reduzir a complexidade                                  |
|* da integração de subsistemas/APIs.                                                     |
|*                                                                                        |
|*---------------------------------------------------------------------------------------*/

import singleton.*;
import strategy.*;
import facade.*;

import estilo.Separador;

public class Test{

   public static void main(String[] args){
   
      Separador separa = new Separador();
   
   
      //Testes de alocação de memoria do Design Pattern Singleton
      
      separa.separarPersonalizado("<Singleton>", 20);
      
      separa.separarPersonalizado("Lazy", 20);
      
      SingletonLazy lazy = SingletonLazy.getInstanciaLazy();
      System.out.println("Singleton alocado em: " + lazy);
      lazy = SingletonLazy.getInstanciaLazy();
      System.out.println("Singleton alocado em: " + lazy);
      
      separa.separarPersonalizado("Eager", 20);
      
      SingletonEager eager = SingletonEager.getInstanciaEager();
      System.out.println("SingletonEager alocado em: " + eager);
      eager = SingletonEager.getInstanciaEager();
      System.out.println("SingletonEager alocado em: " + eager);
      
      separa.separarPersonalizado("LazyHolder", 20);
      
      SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstanciaLazyHolder();
      System.out.println("SingletonLazyHolder alocado em: " + lazyHolder);
      lazyHolder = SingletonLazyHolder.getInstanciaLazyHolder();
      System.out.println("SingletonLazyHolder alocado em: " + lazyHolder);
      
      separa.separarPersonalizado("</Singleton>", 20);
                  
      //Final dos testes de alocação de memoria do Design Pattern Singleton
      
      //Testes de Design Pattern Strategy
      
      separa.separarPersonalizado("<Strategy>", 20);
      
      Strategy normal = new StrategyNormal();            //|   Diferente tipos
      Strategy defenssivo = new StrategyDefensivo();     //|   de comportamentos
      Strategy agressivo = new StrategyAgressivo();      //|   do robo
      
      Robo robo = new Robo();
      
      separa.separarPersonalizado("StrategyNormal", 20);
      
      robo.setComportamento(normal);
      robo.mover();
      robo.mover();
      
      separa.separarPersonalizado("StrategyDefenssivo", 20);
        
      robo.setComportamento(defenssivo);
      robo.mover();
      
      separa.separarPersonalizado("StrategyAgressivo", 20);
      
      robo.setComportamento(agressivo);
      robo.mover();
      robo.mover();
      robo.mover();
      
      separa.separarPersonalizado("</Strategy>", 20);

      //Final dos testes de Design Pattern Strategy
      
      //Facade
      
      separa.separarPersonalizado("<Facade>", 20);
      
      Facade facade = new Facade();
      
      facade.migrarCliente("Joao", "36883555");
      
      separa.separarPersonalizado("</Facade>", 20);
   
   }

}