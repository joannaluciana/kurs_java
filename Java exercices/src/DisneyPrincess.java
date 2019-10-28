
public class DisneyPrincess {
String name;
double height;
int age;
int id;
String song;



public  DisneyPrincess(String name, double height, int age, int id,String song) {
	this.name = name;
	this.height = height;
	this.age = age;
	this.id = id;
	this.song = song;
}

void singsong ()
{
	
	System.out.println (song);
	
}

void sinsing() {
	System.out.println("la la la ");
}
int Agefter(int years) {
	return age+years;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public double getHeight() {
	return height;
}
public int getId() {
	return id;
}


public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getSong() {
	return song;
}

public void setSong(String song) {
	this.song = song;
}

}

