public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int length = data.length;
    int first = 0;
    int second = 0;
    for (int i = 0; i < length-1; i++) {
      for (int j = i+1; j < length; j++) {
        first = data[j-1];
        second = data[j];
        if (second < first) {
          data[j] = first;
          data[j-1] = second;
        }
      }
    }
  }

  public static void selectionSort(int[] data){
    int length = data.length;
    int orig = 0;
    int smallest = 0;
    int smolIndex = 0;
    for (int i = 0; i < length-1; i++) {
      orig = data[i];
      smallest = data[i];
      smolIndex = i;
      for (int j = i+1; j < length; j++) {
        if (data[j] < smallest) {
          smallest = data[j];
          smolIndex = j;
        }
      }
      data[i] = smallest;
      data[smolIndex] = orig;
    }
  }


  public static void insertionSort(int[] data){
    
  }

}
