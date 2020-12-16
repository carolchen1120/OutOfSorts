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
    Random rand = new Random();
    int size = rand.nextInt(100);
    int[] data = new int[size];
    int[] answer = new int[size];
    for (int i = 0; i < size; i++) {
      data[i] = rand.nextInt(10);
    }
    bubbleSort(data);
    answer = data;
    Arrays.sort(data);
    System.out.println(Arrays.equals(answer, data));
  }
}
