package PPT;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if(n > 0)
        {
            System.out.println("positivre number");
        } else if (n < 0) {
            System.out.println("negative number");
        }
        else
        {
            System.out.println("zero");
        }
    }
}
