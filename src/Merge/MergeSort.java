package Merge;

public class MergeSort {
    public static void mergeSort(int[] cartas) {
        mergeSort(cartas, 0, cartas.length - 1);
    }

    private static void mergeSort(int[] cartas, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(cartas, inicio, meio);
            mergeSort(cartas, meio + 1, fim);
            merge(cartas, inicio, meio, fim);
            printArray(cartas); // Imprime o array após cada etapa de ordenação
        }
    }

    private static void merge(int[] cartas, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        for (int i = 0; i < n1; ++i) {
            esquerda[i] = cartas[inicio + i];
        }
        for (int j = 0; j < n2; ++j) {
            direita[j] = cartas[meio + 1 + j];
        }

        int i = 0, j = 0;
        int k = inicio;
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                cartas[k] = esquerda[i];
                i++;
            } else {
                cartas[k] = direita[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            cartas[k] = esquerda[i];
            i++;
            k++;
        }

        while (j < n2) {
            cartas[k] = direita[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("Passo de ordenação: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
