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
    Ao executar o método `metodoRecursivo`, ele chama a si mesmo repetidamente, 
    aumentando o valor de `i` a cada chamada. Isso resulta em um estouro de pilha 
    (stack overflow) quando a pilha de chamadas atinge seu limite, pois não há 
    condição de parada.

    Um estouro de pilha ocorre quando uma função recursiva continua chamando a 
    si mesma sem parar, esgotando a memória da pilha. Para evitar isso, deve-se 
    incluir uma condição de parada no método recursivo, como um limite de valor 
    para `i` ou uma condição que retorne antes de chamar o método novamente.

    Exemplo de correção:
    public static void metodoRecursivo(int i) {
        if (i > 10) return; // Condição de parada
        System.out.println("Chamada recursiva: " + i);
        metodoRecursivo(i + 1);
    }
*/
