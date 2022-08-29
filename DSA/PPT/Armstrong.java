package PPT;

public class Armstrong {
    public static void main(String[] args) {
        int num=9474;
        int temp=num;
        int sum=0;
        String str= String.valueOf(num);
        int pow=str.length();
        while(num>0)
        {
            int digit=num%10;
            sum= (int) (sum+Math.pow(digit,pow));
            num=num/10;


        }
        if(sum==temp)
        {
            System.out.println("it is an armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
}
