package Insertion;

public class InsertionSort {

        public static void insertionSort(int[] cartas){
            for (int carta : cartas) {
                System.out.print(carta + " ");
            }
            System.out.println();
            for (int i = 1; i < cartas.length; ++i) {
                int posicaoVetor = cartas[i];
                int j = i - 1;

                System.out.println("Vetor antes de ordenar " + posicaoVetor);
                for (int k = 0; k < cartas.length; ++k) {
                    System.out.print("");
                    System.out.print((cartas[k] + " "));
                    System.out.print("");

                }

                while (j >= 0 && posicaoVetor < cartas[j]) {
                    cartas[j + 1] = cartas[j];
                    j--;
                }
                cartas[j + 1] = posicaoVetor;
            }

            System.out.println();
            System.out.println("O vetor ordenado: " + " ");
            for (int i = 0; i < cartas.length; ++i) {
                System.out.print(cartas[i] + "");
            }
            System.out.println();
        }
    }