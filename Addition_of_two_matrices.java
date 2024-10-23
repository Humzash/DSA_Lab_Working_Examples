/* Task2: Addition of two matrices*/

package com.mycompany.task01;
import java.util.Scanner;
/**
 *
 * @author 123
 */
public class Addition_of_two_matrices {
    public static void main(String [] args)
    {
        int [][] matrix1 = new int[3][3];
        int [][] matrix2 = new int [3][3];
        int [][] sum = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Numbers for first matrix:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Number [" +i+ "][" +j+ "]:");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter Numbers for second matrix:");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();}
         }
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];}
            
    }
    System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
