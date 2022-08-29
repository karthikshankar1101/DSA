import java.util.Arrays;

public class subsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,98,100,10220,1000,99,8,3,3,2,1};
        int[] increasingSubsequence = new int[2];
        int[] decreasingSubsequence = new int[2];
        int[] flatLine = new int[2];
        int[] seq = new int[2];
        int i = 0;
        seq[0] = 0;
        while(arr[i + 1] > arr[i] && i < arr.length)
        {
            i++;
        }
        seq[1] = i;
        increasingSubsequence[0] = seq[0];
        increasingSubsequence[1] = seq[1];
        seq[0] = i;
        while(arr[i + 1] < arr[i] && i < arr.length)
        {
            i++;
        }
        seq[1] = i;
        decreasingSubsequence[0] = seq[0];
        decreasingSubsequence[1] = seq[1];

        seq[0] = i;
        while(arr[i] == arr[i + 1] && i < arr.length)
        {
            i++;
        }
        seq[1] = i;
        flatLine[0] = seq[0];
        flatLine[1] = seq[1];

        System.out.println("increasing sequence" + Arrays.toString(increasingSubsequence));
        System.out.println("decreasing sequence" + Arrays.toString(decreasingSubsequence));
        System.out.println("flat sequence" + Arrays.toString(flatLine));


    }
}
