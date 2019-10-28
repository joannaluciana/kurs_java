package princesDisney;
import java.util.*;
public class equation {
	
	    public static void main(String[] args) {
	        Scanner skan = new Scanner(System.in);
	         System.out.println ("Pls give numbers to equation x = a +/- b");
		         String streqsk = skan.nextLine();
	            char[] streq = streqsk. toCharArray();
               /* System.out.println (streq[0]);
                System.out.println (Character.getNumericValue(streq[4]));
                if      (streq[0]=='x'){System.out.println ("YES");}*/
	            

	           if       (streq[0]=='x' && streq [6]=='+'){System.out.println (Character.getNumericValue( streq[4])+Character.getNumericValue( streq[8])); }
	            else if (streq[0]=='x' && streq [6]=='-'){System.out.println (Character.getNumericValue( streq[4])-Character.getNumericValue( streq[8])); }
	            else if (streq[4]=='x' && streq [6]=='+'){System.out.println (Character.getNumericValue( streq[0])-Character.getNumericValue( streq[8])); }
	            else if (streq[4]=='x' && streq [6]=='-'){System.out.println (Character.getNumericValue( streq[0])+Character.getNumericValue( streq[8])); }
	            else if (streq[8]=='x' && streq [6]=='+'){System.out.println (Character.getNumericValue( streq[0])-Character.getNumericValue( streq[4])); }
	            else if (streq[8]=='x' && streq [6]=='-'){System.out.println (Character.getNumericValue( streq[4])-Character.getNumericValue( streq[0])); }
	            else if (streq[8]=='x' && streq [2]=='+'){System.out.println (Character.getNumericValue( streq[0])+Character.getNumericValue( streq[4])); }
	            else if (streq[8]=='x' && streq [2]=='-'){System.out.println (Character.getNumericValue( streq[0])-Character.getNumericValue( streq[4])); }
	            else if (streq[4]=='x' && streq [2]=='+'){System.out.println (Character.getNumericValue( streq[8])-Character.getNumericValue( streq[0])); }
	            else if (streq[4]=='x' && streq [2]=='-'){System.out.println (Character.getNumericValue( streq[0])-Character.getNumericValue( streq[8])); }
	            else if (streq[0]=='x' && streq [2]=='+'){System.out.println (Character.getNumericValue( streq[8])-Character.getNumericValue( streq[4])); }
	            else if (streq[0]=='x' && streq [2]=='-'){System.out.println (Character.getNumericValue( streq[8])-Character.getNumericValue( streq[4])); }


	/*x = a (+,-) b
	a = x (+,-) b
	a = b (+,-) x
	a (+,-) b = x
	a (+,-) x = b
	x (+,-) a = b*/
	    }
	}

