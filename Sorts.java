public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int length = data.length;
    int first = 0;
    int second = 0;
    for (int i = 0; i < length; i++) {
      first = data[i];
      for (int j = i+1; i < length; j++) {
        second = data[j];
        if (second < first) {
          data[j] = first;
          data[j-1] = second;
        }
      }
    }
  }
}
