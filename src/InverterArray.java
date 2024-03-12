import java.util.Scanner;

public class InverterArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o tamanho do array
        System.out.print("Digite o tamanho do array (N): ");
        int tamanhoArray = scanner.nextInt();

        // Cria o array de inteiros com o tamanho fornecido
        int[] array = new int[tamanhoArray];

        // Pede ao usuário para preencher o array
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Chama a função para inverter o array
        inverterArray(array);

        // Imprime o array invertido
        System.out.println("Array Invertido:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }

    // Função para inverter o array
    private static void inverterArray(int[] array) {
        int tamanho = array.length;
        for (int i = 0; i < tamanho / 2; i++) {
            // Troca os elementos nas posições i e tamanho - 1 - i
            int temp = array[i];
            array[i] = array[tamanho - 1 - i];
            array[tamanho - 1 - i] = temp;
        }
    }
}
