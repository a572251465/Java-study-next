package plus.chendd;

public class T004_DichotomySearch {
  public static void main(String[] args) {
    int[] values = {1, 2, 3, 5, 6, 8, 10, 24, 50};
    System.out.println(dichotomySearch(values, 6));
    System.out.println(dichotomySearch(values, 10));
    System.out.println(dichotomySearch(values, 25));
  }
  
  public static int dichotomySearch(int[] arr, int compareValue) {
    if (arr == null || arr.length == 0) return -1;
    
    int l = 0, r = arr.length - 1;
    while (l <= r) {
      int mid = l + ((r - l) >> 1);
      if (arr[mid] == compareValue) return mid;
      if (arr[mid] > compareValue) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    
    return -1;
  }
}
