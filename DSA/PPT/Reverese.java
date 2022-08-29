package PPT;

public class Reverese {
    public static void main(String[] args) {
        int n = 67895;
        int new_number = 0;
        System.out.println(n);
        while(n > 0)
        {
            int digit = n % 10;
            new_number = new_number * 10 + digit;
            n = n/10;
        }
        System.out.println(new_number);
    }
}
