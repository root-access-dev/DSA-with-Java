public class D2DSAJavats3 {
  public static int BinarySearchex(int number[], int key) {
    int start = 0, end = number.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (number[mid] == key) {
        return mid;
      } else if (number[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int number[] = { 2, 10 };
    int key = 2;

    int index = BinarySearchex(number, key);
    if (index != -1) {
      System.out.println("Key found at index: " + index);
      System.out.println("Value at that index: " + number[index]);
    } else {
      System.out.println("Key not found");
    }
  }
}