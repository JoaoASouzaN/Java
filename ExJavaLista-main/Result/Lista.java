public class Lista {
    public int tamanho;
    public No cabeca;
    public No cauda;
    
    public Lista(){
        this.tamanho = 0;
        this.cabeca = new No();
        this.cauda = new No();
    }

    // Método pronto, não precisa mexer
    public void adicionarInicio(int valor){
        No novo = new No();
        novo.valor = valor;
        
        if(tamanho == 0){
            novo.proximo = cauda;
        }else{
            novo.proximo = cabeca.proximo;
        }
        cabeca.proximo = novo;
        
        tamanho++;
    }

    // Método pronto, não precisa mexer
    public void imprimirLista(){
        if(tamanho == 0){
            System.out.println("Lista Vazia");
        }else{
            No atual = cabeca.proximo;
            while(atual != cauda){
                System.out.print(atual.valor + " -> ");
                atual = atual.proximo;
            }
            System.out.println("null");
        }
    }

    // Exercício 1: erro na lógica, debugar para encontrar o erro
    public void adicionarFim(int valor){
        No novo = new No();
        novo.valor = valor;
        if(tamanho == 0){
            cabeca.proximo = novo;
        }else{
            No atual = cabeca.proximo;
            while(atual != cauda){
                System.out.print(atual.valor + " -> ");
                atual = atual.proximo;
                //atual = atual.proximo.proximo; cannot read field "proximo" because "atual" is null
                //atual.proximo = atual; elimina a lista e repete o 10 infinitamente
            }
            atual = novo;
           //atual = novo.valor; ERRO: tipos incompativeis, int n pode ser convertido para o No
           System.out.print(atual.valor + " -> ");
        }
        cauda = null;
        novo.proximo = cauda; //40 entra dpois do cauda
        System.out.println(novo.proximo + "  ");
        //atual.proximo = cauda; ERRRO variavel n declarada
        tamanho++;
    }

    // Exercício 2: completar o método que retorna o tamanho da lista sem usar o atributo tamanho
    /*public int obtemTamanho(){
        No atual = cabeca.proximo;
        int tamanho = 0;
        while(atual != cauda){
            // Trecho faltante
            // Trecho faltante
        }
        // Trecho faltante
    }

    // Exercício 3: substituir o trecho faltante por uma lógica correta
    public void removerInicio(){
        if(tamanho == 0){
            System.out.println("Lista Vazia");
        }else{
            // Trecho faltante
            tamanho--;
        }
    }*/
}
