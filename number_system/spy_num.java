package number_system;

public class spy_num 
{
    public static boolean is_spy_num(int n)
    {
        boolean flag = false;
        int temp = n,sum = 0,product = 1;
 
        while(temp != 0)
        {
            temp = n % 10;
            sum += temp;
            product *= temp;
            n /= 10;
        }

        if(product == sum)  flag = true;

        return flag;
    }
    public static void main(String[] args) 
    {
        int n = 1241;
        System.out.println(is_spy_num(n));
    }
}
