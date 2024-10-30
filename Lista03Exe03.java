public class Lista03Exe03 {
    public static void main(String[] args) {
        metodoRecursivo(0);
    }

    public static void metodoRecursivo(int i) {
        System.out.println("Chamada recursiva: " + i);
        metodoRecursivo(i + 1);
    }
}

/*
* Saída no console: O que acontece é que o programa entra em um loop infinito de chamadas recursivas até que a pilha de chamadas se esgote,
* resultando em um StackOverflowError. Um estouro de pilha ocorre quando há muitas chamadas de função empilhadas na memória,
* mais do que o espaço disponível permite. Para evitar isso, podemos limitar a profundidade da recursão. Por exemplo, podemos
* parar a chamada recursiva quando 'i' atingir um determinado valor.

* Alteração para evitar estouro de pilha:
* public static void metodoRecursivo(int i) {
*     if (i > 10) return; // Limita a profundidade da recursão
*     System.out.println("Chamada recursiva: " + i);
*     metodoRecursivo(i + 1);
* }
*/
