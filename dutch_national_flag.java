import java.util.Scanner;

public class dutch_national_flag 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int []arr = new int[size];

        for(int i=0;i<size;i++)
            arr[i] = input.nextInt();

        int low=0 ,mid=0,high = size-1;
        
        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                int temp = arr[low];
                arr[low]= arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }

            else if(arr[mid] == 1)
            {
                mid++;
            }

            else
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high --;
            }
        }

        for (int i : arr) 
        {
            System.out.print(i+" ");
        }

        input.close();
    }
}
