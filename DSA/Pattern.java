import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        if(n > 0)
        {
            System.out.println("\t"+"*");
            for (int i = 1; i <= n ; i++)
            {
                System.out.println("*\t" + (char)(i + 64) + "\t*");
            }
            System.out.println("\t"+"*");
        }
        else
        {
            System.out.println("enter valid value for n");
        }
    }
}
