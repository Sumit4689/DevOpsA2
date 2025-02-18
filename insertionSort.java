
import java.util.Scanner;

public class insertionSort {
    public static void Sort(int arr[], int size) {
        int i, j, temp;
        for (i = 1; i < size; i++) { 
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] myArray = {4,2,6,8,12,1};

        Sort(myArray, size);

        for (int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
