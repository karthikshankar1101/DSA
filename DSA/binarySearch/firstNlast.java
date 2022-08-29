package binarySearch;

import java.util.Arrays;

public class firstNlast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,7,8,8,9};
        int[] ans = new int[2];
        ans[0] = search(arr,7,true);
        ans[1] = search(arr,7,false);
        System.out.println(Arrays.toString(ans));
    }

    public static int search(int[] arr,int target,boolean firstIndex)
    {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while(s <= e)
        {
            int m = s + (e - s)/2;
            if(arr[m] == target)
            {
                ans = m;
                if (firstIndex)
                {
                    e = m - 1;
                }
                else {
                    s = m + 1;
                }
            } else if (arr[m] < target) {
                s = m + 1;
            }
            else {
                e = m - 1;
            }
        }
        return ans;
    }
}
