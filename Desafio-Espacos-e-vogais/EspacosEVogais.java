import java.util.Scanner;

/**
 * Desafio
 * Jorginho é professor do primário de uma determinada escola.
 * Ele tem 100000 alunos e precisa criar um programa que verifica quantos espaços em branco 
 * e quantas vogais existem em uma determinada string de entrada que os alunos entregaram na avaliação final.
 * Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!
 * Entrada: A entrada será uma frase no formato de string. 
 * Saída: A saída deverá retornar quantos espaços em branco e quantas vogais existem na determinada string.
 * Exemplo de Entrada:  “Esse desafio foi facil”
 * Exemplo de Saída: Espacos em branco: 3 Vogais: 10 
 */

public class EspacosEVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int espacosEmBranco = 0, quantVogais = 0;

        for(char c : str.toLowerCase().toCharArray()) {
            if(c == ' ') {
                espacosEmBranco++;
            }else if("aeiou".indexOf(c) != -1) {
                quantVogais++;
            }
        }
        System.out.println("Espaços em branco: " + espacosEmBranco + " Vogais: " + quantVogais);

        sc.close();

    }
}
