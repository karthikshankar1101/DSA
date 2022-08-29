package binarySearch;

public class peakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(findPeak(arr));
    }
    public static int findPeak(int[] arr)
    {
        int s = 0;
        int e = arr.length - 1;
        while(s != e)
        {
            int m = s + (e - s)/2;
            if (arr[m] < arr[m + 1] && m < arr.length - 2 )
            {
                s = m + 1;
            }
            else {
                e = m;
            }

        }
        return s;
    }
}
