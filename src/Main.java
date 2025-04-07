public class Main {
  public static void main(String[] args) {

    int arraySize = 5000000;

    int[] array = new int[arraySize];

    initializeArray(array, arraySize, 0); // 0 - Random order, 1 - Sorted (ascending), 2 - Reverse order (descending)

    int[] arrayBubbleSort = array.clone();
    int[] arraySelectionSort = array.clone();
    int[] arrayInsertionSort = array.clone();
    int[] arrayMergeSort = array.clone();
    int[] arrayHeapSort2 = array.clone();
    int[] arrayCountingSort = array.clone();
    int[] arrayQuicksort = array.clone();

    long startTime, endTime, elapsedSeconds, elapsedMilliseconds;

    // Measure Bubble Sort time
    startTime = System.currentTimeMillis();
    bubbleSort(array, arraySize);
    endTime = System.currentTimeMillis();

    elapsedSeconds = (endTime - startTime) / 1000;
    elapsedMilliseconds = (endTime - startTime) - elapsedSeconds * 1000;

    System.out.println("Bubble Sort Time: " + elapsedSeconds + "s " + elapsedMilliseconds + "ms");

    // Measure Selection Sort time
    startTime = System.currentTimeMillis();
    selectionSort();
    endTime = System.currentTimeMillis();

    elapsedSeconds = (endTime - startTime) / 1000;
    elapsedMilliseconds = (endTime - startTime) - elapsedSeconds * 1000;

    System.out.println("Selection Sort Time: " + elapsedSeconds + "s " + elapsedMilliseconds + "ms");

    // Measure Insertion Sort time
    startTime = System.currentTimeMillis();
    insertionSort();
    endTime = System.currentTimeMillis();

    elapsedSeconds = (endTime - startTime) / 1000;
    elapsedMilliseconds = (endTime - startTime) - elapsedSeconds * 1000;

    System.out.println("Insertion Sort Time: " + elapsedSeconds + "s " + elapsedMilliseconds + "ms");

    // Measure Merge Sort time
    startTime = System.currentTimeMillis();
    mergeSort();
    endTime = System.currentTimeMillis();

    elapsedSeconds = (endTime - startTime) / 1000;
    elapsedMilliseconds = (endTime - startTime) - elapsedSeconds * 1000;

    System.out.println("Merge Sort Time: " + elapsedSeconds + "s " + elapsedMilliseconds + "ms");

    // Measure Heap Sort time
    startTime = System.currentTimeMillis();
    heapSort();
    endTime = System.currentTimeMillis();

    elapsedSeconds = (endTime - startTime) / 1000;
    elapsedMilliseconds = (endTime - startTime) - elapsedSeconds * 1000;

    System.out.println("Heap Sort Time: " + elapsedSeconds + "s " + elapsedMilliseconds + "ms");

    // Measure Counting Sort time
    startTime = System.currentTimeMillis();
    countingSort();
    endTime = System.currentTimeMillis();

    elapsedSeconds = (endTime - startTime) / 1000;
    elapsedMilliseconds = (endTime - startTime) - elapsedSeconds * 1000;

    System.out.println("Counting Sort Time: " + elapsedSeconds + "s " + elapsedMilliseconds + "ms");

    // Measure Quick Sort time
    startTime = System.currentTimeMillis();
    quicksort();
    endTime = System.currentTimeMillis();

    elapsedSeconds = (endTime - startTime) / 1000;
    elapsedMilliseconds = (endTime - startTime) - elapsedSeconds * 1000;

    System.out.println("Quick Sort Time: " + elapsedSeconds + "s " + elapsedMilliseconds + "ms");
  }

  /**
   * Initializes the array with the specified order.
   * @param array The array to initialize.
   * @param size The size of the array.
   * @param order The order type: 0 - Random, 1 - Ascending, 2 - Descending.
   */
  static void initializeArray(int[] array, int size, int order) {
  switch (order) {
    case 0: // Random order
      for (int i = 0; i < size; i++) {
        array[i] = (int) (Math.random() * (size * 2));
      }
      break;
    case 1: // Sorted in ascending order
    for (int i = 0; i < size; i++) {
        array[i] = i + 1;
    }
      break;
    case 2: // Sorted in descending order
      for (int i = size; i > 0; i--) {
        array[i - 1] = i;
      }
      break;
    }
  }

  /**
   * Displays the array in a formatted way.
   * @param array The array to display.
   * @param size The size of the array.
   */
  private static void displayArray(int[] array, int size) {
    for (int i = 0; i < size; i++) {
      if (array[i] < 10) {
        System.out.print("0" + array[i] + " ");
      } else {
        System.out.print(array[i] + " ");
      }
    }
    System.out.println();
  }

  private static void bubbleSort(int[] vet, int N) {
    
  }

  private static void selectionSort() {
    
  }

  private static void insertionSort() {
    
  }

  private static void mergeSort() {
    
  }

  private static void heapSort() {
    
  }

  private static void countingSort() {
    
  }

  private static void quicksort() {
    
  }
}