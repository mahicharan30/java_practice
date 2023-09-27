import java.util.*;

public class kadanes_algorithm
{
    public static void find_maximum_sum(int n,int[] arr)
    {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for(int i=0;i<n;i++)
        {
            max_ending_here += arr[i];
            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if(max_ending_here < 0)
                max_ending_here = 0;
        }
        System.out.println(max_so_far);
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int []arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr.length;
        find_maximum_sum(n,arr);
        input.close();
    }
}
