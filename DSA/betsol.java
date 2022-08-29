public class betsol {
    public static void main(String[] args) {
        String str = "Bangaloooore hhhhhhas very good gardens which are populated by joggerssss heavilyyy";
        String output = new String();
        for (int i = 0; i < str.length() - 1;) {
            if(str.charAt(i) == str.charAt(i + 1))
            {
                i = i + 2;
            }
            else
            {
                output += Character.toString(str.charAt(i));
                i++;
            }

        }
        System.out.println(output);
    }
}
