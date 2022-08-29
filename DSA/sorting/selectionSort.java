package sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,9,1,4,8,6,3,2,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr)
    {
        for (int i = arr.length - 1; i >= 0 ; i--) {
            int index = findMax(arr,0,i);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static int findMax(int[] arr,int start,int end)
    {
        int max = 0;
        int index = -1;
        for (int i = start; i <= end ; i++) {
            if (arr[i] > max)
            {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
