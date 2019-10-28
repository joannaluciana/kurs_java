package princesDisney;

import java.util.Scanner;

public class Queen {
	
	   

		private static Scanner scanner;

		public static void main(String[] args) {
	       
			
			  scanner = new Scanner(System.in);
	            int x1 = Math.abs(scanner.nextInt());
	            int y1 = Math.abs(scanner.nextInt());
	            int x2 = Math.abs(scanner.nextInt());
	            int y2 = Math.abs(scanner.nextInt());

	        if (x1-x2 ==y1-y2 ||x1-x2==0||y1-y2==0) {System.out.println ("YES");} 
	        else {System.out.println ("NO");}


	    }
	}

