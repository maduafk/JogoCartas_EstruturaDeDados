import Heap.HeapSort;
import Selection.SelectionSort;
import Quick.QuickSort;
import Bubble.BubbleSort;
import Insertion.InsertionSort;
import Merge.MergeSort;

import java.util.Scanner;

public class JogoDeCartas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cartas = new int[7];
        boolean valoresInseridos = false;

        System.out.println("Bem vindo ao teste de métodos");

        valoresInseridos = true;
        System.out.println("\nEscolhe 7 valores de cartas de 1 a 13:");

        for (int i = 0; i < 7; i++) {
            int valorCarta;
            do {
                System.out.print("Carta " + (i + 1) + ": ");
                valorCarta = scanner.nextInt();
                if (valorCarta < 1 || valorCarta > 13) {
                    System.out.println("Escolha um número entre 1 e 13.");
                }
            } while (valorCarta < 1 || valorCarta > 13);
            cartas[i] = valorCarta;
        }
        System.out.println("Valores das cartas inseridos com sucesso!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Método Selectionsort");
            System.out.println("2 - Método de Heapsort");
            System.out.println("3 - Método de Quicksort");
            System.out.println("4 - Método BubbleSort");
            System.out.println("5 - Método InsertionSort");
            System.out.println("6 - Método MergeSort");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    long startTimeSelection = System.nanoTime();
                    SelectionSort selectionSort = new SelectionSort();
                    selectionSort.selectionSort(cartas);
                    long endTimeSelection = System.nanoTime();
                    double durationSelection = (endTimeSelection - startTimeSelection) / 1_000_000_000.0;
                    if (!valoresInseridos) {
                        break;
                    }
                    System.out.println("\nOrdenando usando Selection Sort:");
                    System.out.println("Tempo de execução: " + durationSelection + " segundos");
                    break;
                case 2:
                    long startTimeHeap = System.nanoTime();
                    HeapSort heapSort = new HeapSort();
                    heapSort.heapSort(cartas);
                    long endTimeHeap = System.nanoTime();
                    double durationHeap = (endTimeHeap - startTimeHeap) / 1_000_000_000.0;
                    if (!valoresInseridos) {
                        break;
                    }
                    System.out.println("\nOrdenando usando Heap Sort:");
                    System.out.println("Tempo de execução: " + durationHeap + " segundos");
                    break;
                case 3:
                    long startTimeQuick = System.nanoTime();
                    QuickSort.sort(cartas);
                    long endTimeQuick = System.nanoTime();
                    double durationQuick = (endTimeQuick - startTimeQuick) / 1_000_000_000.0;
                    if (!valoresInseridos) {
                        break;
                    }
                    System.out.println("\nOrdenando usando Quick Sort:");
                    System.out.println("Tempo de execução: " + durationQuick + " segundos");
                    break;
                case 4:
                    long startTimeBubble = System.nanoTime();
                    BubbleSort.bubbleSort(cartas);
                    long endTimeBubble = System.nanoTime();
                    double durationBubble = (endTimeBubble - startTimeBubble) / 1_000_000_000.0;
                    if (!valoresInseridos) {
                        break;
                    }
                    System.out.println("\nOrdenando usando Bubble Sort:");
                    System.out.println("Tempo de execução: " + durationBubble + " segundos");
                    break;
                case 5:
                    long startTimeInsertion = System.nanoTime();
                    InsertionSort.insertionSort(cartas);
                    long endTimeInsertion = System.nanoTime();
                    double durationInsertion = (endTimeInsertion - startTimeInsertion) / 1_000_000_000.0;
                    if (!valoresInseridos) {
                        break;
                    }
                    System.out.println("\nOrdenando usando Insertion Sort:");
                    System.out.println("Tempo de execução: " + durationInsertion + " segundos");
                    break;
                case 6:
                    long startTimeMerge = System.nanoTime();
                    MergeSort.mergeSort(cartas);
                    long endTimeMerge = System.nanoTime();
                    double durationMerge = (endTimeMerge - startTimeMerge) / 1_000_000_000.0;
                    if (!valoresInseridos) {
                        break;
                    }
                    System.out.println("\nOrdenando usando Merge Sort:");
                    System.out.println("Tempo de execução: " + durationMerge + " segundos");
                    break;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
