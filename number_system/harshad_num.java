package number_system;

import java.util.Scanner;

public class harshad_num 
{
    public static boolean is_harshad_num(int n)
    {
        boolean flag = false;
        int temp = n,sum = 0;

        while(temp != 0)
        {
            temp %= 10;
            sum += temp;
            temp /=10;
        }

        if(n % sum == 0)    flag = true;
        return flag;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(is_harshad_num(n));

        input.close();
    }
}
