// Moore voting algorithm
// greater than size/2 or >(n/2)

import java.util.Scanner;

public class majority_element 
{
    public static int find_majority_element(int[] arr,int size)
    {
        int candidate = 0,count = 0;
        for(int candidates : arr)
        {
            if(count == 0)
            {
                candidate = candidates;
                count = 1;
            }

            else if(candidates == candidate) count++;
            else    count--;
        }
        return candidate;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++)
            arr[i] = input.nextInt();

        int res = find_majority_element(arr,size);
        System.out.println("Majority element: "+res);
        
        input.close();
    }
}