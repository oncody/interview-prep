package sort;

public class BubbleSorter {
  public static int[] sort(int[] array) {
    int upperMax = array.length;
    boolean swapped = true;

    while(swapped) {
      swapped = false;

      for(int i = 0; i < upperMax - 1; i++) {
        if(array[i] < array[i + 1]) {
          int temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp;
          swapped = true;
        }
      }
      upperMax--;
    }

    return array;
  }
}
