/**
 * The purpose of this program is to perform the addition of two matrices, as indicated
 * by the user
 * 
 * Source: http://sampleprogramz.com/java/matrix.php#
 * 
 * */

import java.util.Scanner;
 
public class Matrix_Addition {
	
	Scanner scan;
	int matrix1[][], matrix2[][], sum[][];
	int row, column;
 
	void create() {
		
		scan = new Scanner(System.in);
		
		System.out.println("Matrix Addition");
		
		// First Matrix Creation..
		System.out.println("\nEnter number of rows & columns");
		row = Integer.parseInt(scan.nextLine());
		column = Integer.parseInt(scan.nextLine());
		
		matrix1 = new int[row][column];
		matrix2 = new int[row][column];
		sum = new int[row][column];
 
		System.out.println("Enter the data for first matrix :");
 
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				matrix1[i][j] = scan.nextInt();
			}
		}
		
		// Second Matrix Creation..
		System.out.println("Enter the data for second matrix :");
 
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				matrix2[i][j] = scan.nextInt();
			}
		}
	}
	
	void display() {
		
		System.out.println("\nThe First Matrix is :");
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				System.out.print("\t" + matrix1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n\nThe Second Matrix is :");
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				System.out.print("\t" + matrix2[i][j]);
			}
			System.out.println();
		}
	}
	
	void add() {
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("\n\nThe Sum is :");
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				System.out.print("\t" + sum[i][j]);
			}
			System.out.println();
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		Matrix_Addition obj = new Matrix_Addition();
		
		obj.create();
		obj.display();
		obj.add();
	}
}