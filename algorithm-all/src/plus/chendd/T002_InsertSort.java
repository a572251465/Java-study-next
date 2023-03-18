package plus.chendd;

public class T002_InsertSort {
  public static void main(String[] args) {
    int[] values = {10, 2, 4, 1, 6, 9, 9, 3};
    print(values);
    insertSort(values);
    print(values);
  }
  
  public static void insertSort(int[] arr) {
    if (arr == null || arr.length < 2) return;
    
    for (int i = 1; i < arr.length; i++) {
      for (int j = i; j >= 1 && arr[j] < arr[j - 1]; j--) {
        swap(arr, j, j - 1);
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
