import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * DESAFIO
 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema da imagem.
 * Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
 * Entrada
 * A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal 
 * Saída
 * Imprima o nome do animal correspondente à entrada fornecida.
 * Exemplo de Entrada: "vertebrado/mamifero/onivoro"
 * Exemplo de Saída: "homem"
**/
public class Animal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        //criando HashMap do esquema 
        HashMap<String, String> animalMap = new HashMap<>();
        animalMap.put("vertebrado-ave-carnivoro", "aguia");
        animalMap.put("vertebrado-ave-onivoro", "pomba");
        animalMap.put("vertebrado-mamifero-onivoro", "homem");
        animalMap.put("vertebrado-mamifero-herbivoro", "vaca");
        animalMap.put("invertebrado-inseto-hematofago", "pulga");
        animalMap.put("invertebrado-inseto-herbivoro", "lagarta");
        animalMap.put("invertebrado-anelideo-hematofago", "sanguessuga");
        animalMap.put("invertebrado-anelideo-onivoro", "minhoca");

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        String animalKey = AN1 + "-" + AN2 + "-" + AN3;
        String animal = animalMap.get(animalKey);
        
        System.out.println(animal);

        sc.close();
        
    }
}
