import java.util.Scanner;
public class SetMatrixZero 
{
    public static void set_matrixzero(int[][] arr,int r,int c)
    {
        boolean [][]visited = new boolean[r][c];

        for(int i = 0;i < r;i++)
        {
            for(int j = 0;j < c;j++)
            {
                if(arr[i][j] == 0 && visited[i][j] == false)
                {
                   setZero(i,j,arr,visited);
                }
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void setZero(int x,int y, int[][] arr, boolean[][] visited)
    {
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0;i < n;i++)
        {
            if(arr[i][y] != 0)
            {
                arr[i][y] = 0;
                visited[i][y] = true;
            }
        }
        for(int j = 0;j < m;j++)
        {
            if(arr[x][j] != 0)
            {
                arr[x][j] = 0;
                visited[x][j] = true;
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt(),c = input.nextInt();
        int [][]arr = new int[r][c];
        for(int i = 0;i < r;i++)
            for(int j = 0;j < c;j++)
                arr[i][j] = input.nextInt();

        set_matrixzero(arr,r,c);
        input.close();
    }
}