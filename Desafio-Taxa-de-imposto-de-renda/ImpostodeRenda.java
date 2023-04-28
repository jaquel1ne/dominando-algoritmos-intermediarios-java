import java.util.Scanner;

/**
 * Desafio
 * Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos,
 * pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população,
 * sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.
 * Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli.
 * Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo:
 * DE 0,00 A R$ 2000,00 - ISENTO
 * DE 2000,01 A R$ 3000,00 - 8% 
 * DE 3000,01 A R$ 4500,00 - 18%
 * ACIMA DE R$ 4500,00 - 28%
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
 * pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
 * O valor deve ser impresso com duas casas decimais.
 * Entrada: A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
 * Saída: Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, 
 * com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".
 * Exemplo de Entrada: 3002.00
 * Exemplo de Saída: R$ 80.36
 */

public class ImpostodeRenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = renda <= 2000 ? 0 : 
                         renda <= 3000 ? (renda - 2000) * 0.08 :
                         renda <= 4500 ? (1000 * 0.08) + (renda - 3000) * 0.18 :
                                         (1000 * 0.08) + (1500 * 0.18) + ((renda - 4500) * 0.28);
        
        String impostoFormatado = imposto == 0 ? "Isento" : String.format("R$ %.2f", imposto);
        System.out.println(impostoFormatado);

        leitor.close();
    }
}
