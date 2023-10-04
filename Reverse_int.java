public class Reverse_int {
    public static void main(String[] args) {
        int n = -12929;
       // boolean negative = false;
        int temp = n,sum = 0;
       // if(n < 0)   negative = true;
        while(temp != 0)
        {
            int rem = temp % 10;
            sum *= 10;
            sum += rem;
            temp /= 10;
        }

         System.out.println(sum);
        //System.out.println(sum);
    }
}
