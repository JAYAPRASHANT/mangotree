package mango;

import java.util.Scanner;

public class Mango_Tree {

	public static void main(String[] args) {
			   Scanner sc=new Scanner(System.in);
			   int x=sc.nextInt();
			   int y=sc.nextInt();
			   int z=sc.nextInt();
			   if(z<=x) {
				   System.out.print("true");
			   }
			   else if((z-1)%10==0) {
				   System.out.println("true");
				   
			   }
			   else if(z%10==0) {
				   System.out.println("false");
			   }
			}
			
		}

	


