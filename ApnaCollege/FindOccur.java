package ApnaCollege;

public class FindOccur{
  public static int findIndex(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    }

    if (arr[i] == key) {
      return i;
    }

    return findIndex(arr, key, i+1);
  }

  public static void main(String args[]) {
int arr[] = {3,4,3,5,5,5,32,32212,2,54};
System.out.println(findIndex(arr, 322122, 0));
  }
}