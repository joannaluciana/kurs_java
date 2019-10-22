package princesDisney;

public class Princes {
	
	
	int height;
	String haircolor;
	int age;
	String nationality;
	String lala;
	
	
	public static void main(String args[]){
	Princeslist Princesclass = new Princeslist ();	
	Princes Cinderella = new Princes ();
	Princes Belle = new Princes ();
	Princes Rapunzel = new Princes ();
	
	
	Cinderella.height=156;
	Cinderella.haircolor="blond";
	Cinderella.age=22;
	Cinderella.nationality="France";
	Cinderella.lala="La viva la France";
	Princesclass.dodaj(Cinderella);
	
	System.out.println("Cinderella is "+Cinderella.height + " heigh, her haircolor is " + Cinderella.haircolor + ", her nationality is " + Cinderella.nationality);
	Singdisney.Singsing(Cinderella.lala);
	
	

	Belle.height=166;
	Belle.haircolor="brown";
	Belle.age=24;
	Belle.nationality="France";
	Belle.lala="La viva la France, la la la, and Gaston";
	Princesclass.dodaj(Belle);
	
	System.out.println("Belle is "+Belle.height + " heigh, her haircolor is " + Belle.haircolor + ", her nationality is " + Belle.nationality);
	Singdisney.Singsing(Belle.lala);
	
	
	Rapunzel.height=160;
	Rapunzel.haircolor="blond";
	Rapunzel.age=21;
	Rapunzel.nationality="Germany";
	Rapunzel.lala="Deutschland, deutschland, ueber alles!!! ";
	Princesclass.dodaj(Rapunzel);
	
	System.out.println("Rapunzel is "+Rapunzel.height + " heigh, her haircolor is " + Rapunzel.haircolor + ", her nationality is " + Rapunzel.nationality);
	Singdisney.Singsing(Rapunzel.lala);
	
	}
	
	
	

}
