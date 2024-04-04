package Quick;

public class QuickSort {
    public static void sort(int[] cartas) {
        quicksort(cartas, 0, cartas.length - 1, 1);
    }

    private static void quicksort(int[] cartas, int esquerda, int direita, int passo) {
        if (esquerda < direita) {
            int pi = passo(cartas, esquerda, direita);
            System.out.println("\nPasso " + passo + ":");
            imprimirArray(cartas);
            quicksort(cartas, esquerda, pi - 1, passo + 1);
            quicksort(cartas, pi + 1, direita, passo + 1);
        }
    }

    private static int passo(int[] cartas, int esquerda, int direita) {
        int pivo = cartas[direita];
        int i = (esquerda - 1);
        for (int j = esquerda; j < direita; j++) {
            if (cartas[j] < pivo) {
                i++;
                int temp = cartas[i];
                cartas[i] = cartas[j];
                cartas[j] = temp;
            }
        }
        int temp = cartas[i + 1];
        cartas[i + 1] = cartas[direita];
        cartas[direita] = temp;
        return i + 1;
    }

    private static void imprimirArray(int[] cartas) {
        for (int valor : cartas) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
