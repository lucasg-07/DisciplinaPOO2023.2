/**
 * Question Number : 1
   20 de ago. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.questao1;
import java.util.Scanner;
public class Principal {


	public static void main(String[] args) {
		
		System.out.println("The sum of 4 integers numbers  ");
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Write the first value : ");
		int num1 = sc.nextInt();
		
		System.out.print("Write the second value : ");
		int num2 = sc.nextInt();
		
		System.out.print("Write the third value : ");
		int num3 = sc.nextInt();
		
		System.out.print("Write the fourth value : ");
		int num4 = sc.nextInt();
		
		int sum = num1 + num2 + num3 + num4;
		System.out.println("The result of the sum is : " + sum);
		}
		finally {
			sc.close();
		}
	}

}
