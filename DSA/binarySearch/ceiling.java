package binarySearch;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = ceilingNumber(arr,31);
        System.out.println(n);
    }
    public static int ceilingNumber(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int m = start + (end - start)/2;
            if(arr[m] == target)
            {
                return arr[m];
            }
            if (arr[m] < target)
            {
                start = m + 1;
            }
            else
            {
                end = m - 1;
            }

        }
        return arr[start];
    }
}
