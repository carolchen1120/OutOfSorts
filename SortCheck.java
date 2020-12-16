import java.util.*;

public class SortCheck{
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

  public static void main(String[] arr){
    int[] data = {1, 3, 2, 7, 5};
    int[] answer = {1, 2, 3, 5, 7};
    bubbleSort(data);
    System.out.println(Arrays.equals(answer, data));
  }
}
