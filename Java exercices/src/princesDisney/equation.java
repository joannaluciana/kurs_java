package princesDisney;
import java.util.*;
public class equation {
	


		public static void main(String[] args) {
	        Scanner skan = new Scanner(System.in);
	         System.out.println ("Pls give numbers to equation x = a +/- b");
		         String streqsk = skan.nextLine();
		         String [] streq = streqsk.split(" ");
		         //System.out.println ((Integer.parseInt(streq[2]))+(Integer.parseInt(streq[4])));
		     
	          
	       if       (streq[0].equals("x") && streq [3].equals("+")){System.out.println ((Integer.parseInt(streq[2]))+(Integer.parseInt(streq[4])));  }
	           else if (streq[0].equals("x") && streq[3].equals("+")){System.out.println ((Integer.parseInt( streq[2]))-(Integer.parseInt( streq[4]))); }
	           else if (streq[2].equals("x") && streq[3].equals("+")){System.out.println ((Integer.parseInt( streq[0])-Integer.parseInt( streq[4]))); }
	            else if (streq[2].equals("x") && streq [3].equals("-")){System.out.println ((Integer.parseInt( streq[0])+Integer.parseInt( streq[4])));}
	            else if (streq[4].equals("x") && streq [3].equals("+")){System.out.println ((Integer.parseInt( streq[0])-Integer.parseInt( streq[4]))); }
	            else if (streq[4].equals("x") && streq [3].equals("-")){System.out.println ((Integer.parseInt( streq[4])-Integer.parseInt( streq[0]))); }
	            else if (streq[4].equals("x") && streq [2].equals("+")){System.out.println ((Integer.parseInt( streq[0])+Integer.parseInt( streq[4]))); }
	            else if (streq[4].equals("x") && streq [2].equals("+")){System.out.println ((Integer.parseInt( streq[0])-Integer.parseInt( streq[4]))); }
	            else if (streq[3].equals("x") && streq [2].equals("+")){System.out.println ((Integer.parseInt( streq[4])-Integer.parseInt( streq[0]))); }
	            else if (streq[3].equals("x") && streq [2].equals("-")){System.out.println ((Integer.parseInt( streq[0])-Integer.parseInt( streq[4])));}
	            else if (streq[0].equals("x") && streq [2].equals("+")){System.out.println ((Integer.parseInt( streq[4])-Integer.parseInt( streq[2]))); }
	            else  if (streq[0].equals("x") && streq [2].equals("-")){System.out.println ((Integer.parseInt( streq[4])-Integer.parseInt( streq[2])));}


	/*x = a (+,-) b
	a = x (+,-) b
	a = b (+,-) x
	a (+,-) b = x
	a (+,-) x = b
	x (+,-) a = b*/
	    }
	}

