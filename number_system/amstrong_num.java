package number_system;

import java.util.Scanner;;

public class amstrong_num 
{
    public static boolean is_amstrong_num(int n,int len)
    {
        boolean flag = false;
        int sum = 0,temp = n;

        while(temp != 0)
        {
            int rem = temp % 10,pow=1;
            for(int i=1;i<=len;i++)
                pow *= rem;
            
            sum += pow;
            temp /= 10;
        }
        
        if(sum == n)    
            flag = true;
        
        return flag;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int len =0,temp = n;

        while(temp !=0)
        {
            temp /=10;
            len++;
        }
        System.out.println(is_amstrong_num(n,len));

        input.close();
    }
}
