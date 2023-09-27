package number_system;

import java.util.Scanner;
public class strong_num
{
    public static int fact(int x)
    {
        int factorial = 1;
        for(int i=1;i<=x;i++)
            factorial = factorial * i;
        return factorial;
    }

    public static boolean check_strong_num(int n)
    {
        int temp = n,sum =0,rem;
        boolean flag = false;

        while(temp != 0)
        {
            rem = temp % 10;
            sum += fact(rem);
            temp /= 10;
        }

        if(sum == n)   flag = true;
        return flag;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(check_strong_num(n));
        input.close();
    }
}
