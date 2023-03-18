package plus.chendd;

public class T001_SelectSort {
  public static void main(String[] args) {
    int[] values = {10, 2, 4, 1, 6, 9, 9, 3};
    print(values);
    selectSort(values);
    print(values);
  }
  
  public static void print(int[] arr) {
    for (int item : arr) {
      System.out.print(item + " ");
    }
    System.out.println();
  }
  
  public static void selectSort(int[] arr) {
    if (arr == null || arr.length < 2) return;
    
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        minIndex = arr[minIndex] < arr[j] ? minIndex : j;
      }
      
      if (i != minIndex) swap(arr, i, minIndex);
    }
  }
  
  public static void swap(int[] arr, int x, int y) {
    int tmp = arr[x];
    arr[x] = arr[y];
    arr[y] = tmp;
  }
}
