import java.util.Scanner;
public class spiral_matrix 
{
    public static void spiral_mat(int[][] mat)
    {
        int left = 0,right =mat[0].length-1,top = 0,bottom = mat.length-1;

        while(true)
        {
            if(left > right)    break;
            for(int i = left;i <= right;i++)
                System.out.print(mat[top][i]+" ");

            top++;

            if(top > bottom)    break;
            for(int i = top;i <= bottom;i++)
                System.out.print(mat[i][right]+" ");

            right--;

            if(left > right)    break;
            for(int i = right;i >= left;i--)
                System.out.print(mat[bottom][i]+" ");

            bottom--;

            if(top > bottom)    break;
            for(int i= bottom;i >= top;i--)
                System.out.print(mat[i][left]+" ");
            
            left ++;
        }
    }
    public static void main(String[] args) 
    {
        // int[][] mat =
        // {
        //     { 1, 2, 3, 4, 5},
        //     {6,7,8,9,10},
        //     {11,12,13,14,15},
        //     {16,17,18,19,20},
        //     {21,22,23,24,25}
        // };

        Scanner input = new Scanner(System.in);
        int m = input.nextInt(),n = input.nextInt();
        int mat[][] = new int[m][n];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j] = input.nextInt();
            }
        }

        spiral_mat(mat);

       input.close();
    }
}
