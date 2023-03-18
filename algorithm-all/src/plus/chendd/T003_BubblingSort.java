package plus.chendd;

public class T003_BubblingSort {
  public static void main(String[] args) {
    int[] values = {10, 2, 4, 1, 6, 9, 9, 3};
    print(values);
    bubblingSort(values);
    print(values);
  }
  
  public static void bubblingSort(int[] arr) {
    if (arr == null || arr.length < 2) return;
    
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
      }
    }
  }
  
  public static void print(int[] arr) {
    for (int item : arr) {
      System.out.print(item + " ");
    }
    System.out.println();
  }
  
  public static void swap(int[] arr, int x, int y) {
    int tmp = arr[x];
    arr[x] = arr[y];
    arr[y] = tmp;
  }
}
