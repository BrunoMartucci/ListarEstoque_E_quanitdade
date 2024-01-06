import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] descricoes = new String[5];
        int[] estoques = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a descrição do produto " + (i + 1) + ": ");
            descricoes[i] = scanner.nextLine();

            System.out.println("Digite o estoque do produto " + (i + 1) + ": ");
            estoques[i] = scanner.nextInt();
            scanner.nextLine();
        }


        ordenarPorEstoque(descricoes, estoques);


        System.out.println("\nProdutos ordenados por estoque em ordem crescente:");
        for (int i = 0; i < 5; i++) {
            System.out.println(descricoes[i] + " - Estoque: " + estoques[i]);
        }

        scanner.close();
    }


    private static void ordenarPorEstoque(String[] descricoes, int[] estoques) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (estoques[j] > estoques[j + 1]) {
                    // Trocar posições
                    int tempEstoque = estoques[j];
                    estoques[j] = estoques[j + 1];
                    estoques[j + 1] = tempEstoque;

                    String tempDescricao = descricoes[j];
                    descricoes[j] = descricoes[j + 1];
                    descricoes[j + 1] = tempDescricao;
                }
            }
        }
    }
}
