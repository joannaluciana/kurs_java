

public class Sevenheven2 {
public boolean findNumber( int[] number) {
for (int i = 0; i < number.length; i++) {
if (number[i] >= 10 || number[i]>= -10) {
String num = String.valueOf(number[i]);//returns string representation
char[] tab = num.toCharArray();
for (int j = 0; j < tab.length ; j++) {
if(tab[j] == '7') {
return true;
}
}
} else if (number[i] == 7) {
return true;
}
}
return false;
}
public static void main(String[] args) {
int array[] = {5, 4, 3, 2, 0,1,23,58,7};
Sevenheven2  obj = new Sevenheven2 ();
System.out.println(obj.findNumber(array));
}
}