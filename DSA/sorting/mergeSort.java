package sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(merge(arr)));
    }
    static int[] merge(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge(Arrays.copyOfRange(arr,mid,arr.length));
         return mergeTwo(left,right);
    }

    public static int[] mergeTwo(int[] left, int[] right) {
        int i = 0,j = 0, k = 0;
        int[] mix = new int[left.length + right.length];
        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                mix[k++] = left[i];
                i++;
            }
            else{
                mix[k++] = right[j];
                j++;
            }
        }
        while(i < left.length)
        {
            mix[k++] = left[i];
            i++;
        }
        while(j < right.length)
        {
            mix[k++] = right[j];
            j++;
        }
        return mix;
    }
}
