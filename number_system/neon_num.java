package number_system;

import java.util.Scanner;

public class neon_num 
{
    public static boolean check_neon_num(int n)
    {
        boolean flag = false;

        int square = n * n,temp = square,sum =0;

        while(temp != 0)
        {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }

        if(sum == n)    flag = true;

        return flag;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(check_neon_num(n));
        input.close();
    }
}
