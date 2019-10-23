
public class Dectoctal {

	
public static void main(String[] args) {
    int val = 768;
    // integer
    System.out.println(val);
    // octal
    String oct=Integer.toOctalString(val);

    //System.out.println (oct); 
   
    System.out.print (oct.charAt(oct.length()-1)); 
 }
}