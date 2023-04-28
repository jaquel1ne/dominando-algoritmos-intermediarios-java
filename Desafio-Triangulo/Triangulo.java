import java.util.Scanner;

/**
 * Desafio
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
 * Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:
 * Perimetro = XX.X
 * Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:
 * Area = XX.X
 * Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2
 * Entrada: A entrada contém três valores reais.
 * Saída: O resultado deve ser apresentado com uma casa decimal.
 * Exemplo de Entrada: 6.0, 4.0, 2.0
 * Exemplo de Saída: Area = 10.0
 */

public class Triangulo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        boolean triangulo = A < B + C && B < A + C && C < A + B;

        String resultado = triangulo ? String.format("Perimetro %.1f", A + B + C)
                           : String.format("Area = %.1f", ((A + B) * C) / 2);

        System.out.println(resultado);

        leitor.close();

    }
    
}
