
public class Princessformation {

	public static void main(String[] args) {
	DisneyPrincess Cinderella = new  DisneyPrincess ("Cinderella",169.5, 23, 1, "what a day!!!!");
	DisneyPrincess Pocahontas = new  DisneyPrincess ("Pocahontas",165.5, 20, 2, "what a day!!!! hey forest!!!");
	Cinderella.singsong();
	Cinderella.sinsing();
	System.out.println(Cinderella.getName()+ " is now " + Cinderella.getAge() + " in 2024, she will be " + Cinderella.Agefter(5)  );
	Pocahontas.singsong();
	Pocahontas.sinsing();
	System.out.println(Pocahontas.getName()+ " is now " + Pocahontas.getAge() + " in 2024, she will be " + Pocahontas.Agefter(5)  );
}

}