package practiceProblems;

import java.util.Scanner;

public class downwardStarTriangle_Debdyuti {

public static void main(String args[]) {
		
		System.out.print("Enter number : ");
		
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			for(int j=number;j>=i;j--)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
	
}
