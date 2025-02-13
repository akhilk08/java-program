import java.util.*;
class Symmetry {
    public static void main(String args[])
    {
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix:");
        r = sc.nextInt();
        System.out.println("Enter the number of columns of matrix:");
        c = sc.nextInt();
        if (r != c) 
        {
            System.out.println("This is not a square matrix, hence cannot be symmetric.");
            return;
        }
        int[][] matrix = new int[r][c];
        int[][] transpose = new int[r][c]; 
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix elements are:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < r; i++) 
            for (int j = 0; j < c; j++) 
            {
                transpose[i][j] = matrix[j][i];
            }
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println("");
        }   
        boolean isSymmetric = true;
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++)
             {
                if (matrix[i][j] != transpose[i][j]) 
                {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) 
            	break;
        }
        if (isSymmetric) 
        {
            System.out.println("This is a symmetric matrix.");
        } else 
        {
            System.out.println("This is not a symmetric matrix.");
        }
    }
}

