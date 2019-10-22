package princesDisney;

public class Princeslist {
	private Princes [] Princeschool = new Princes [3];
	private int nastepnyID = 1;
	
	public void dodaj (Princes p) {
		
	if (nastepnyID < Princeschool.length ) {
		Princeschool[nastepnyID ]= p;
		System.out.println ("Princes ID : " +nastepnyID);
		nastepnyID++;
	}
	}

}
