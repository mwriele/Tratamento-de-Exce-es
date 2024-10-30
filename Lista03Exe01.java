import java.util.Scanner;

public class Lista03Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            if (num1 <= 0 || num2 <= 0) {
                throw new IllegalArgumentException("Os números devem ser positivos.");
            }

            double resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
