package PPT;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        for (int i = 0; i < n; i++) {
            if(i <= 1)
            {
                nextTerm = i;
            }
            else {
                nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println(nextTerm + " ");
        }
    }
}
