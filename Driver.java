
/**
 * The purpose of this program is to perform various matrix operations, as indicated
 * by the user
 * 
 * @author Kayla Osborne 
 * @version 20 September 2016
 */

import java.io.*;
import java.util.*; 


public class Driver
{
    public static void main(String []args) throws IOException
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the number corresponding with the matrix operation you would like to complete below.");
        System.out.println("1. Additon");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println(" ");
            
        int choice;
        choice = userInput.nextInt();
        
        if (choice == 1)
        {
           Matrix_Addition obj = new Matrix_Addition();
		
           obj.create();
           obj.display();
           obj.add();
        }
        
        else if (choice == 2)
        {
            Matrix_Subtraction obj = new Matrix_Subtraction();
		
            obj.create();
            obj.display();
            obj.sub();
        }
        
        else if (choice == 3)
        {
            Matrix_Multiplication obj = new Matrix_Multiplication();
		
            obj.create();
            obj.display();
            obj.multi();
        }
        
        else if (choice == 4)
        {
            Matrix_Division obj = new Matrix_Division();
		
            obj.create();
            obj.display();
            obj.div();
        }
        
        else
        {
            System.out.println("Invalid Choice.");
        }
        
        
    }
}
