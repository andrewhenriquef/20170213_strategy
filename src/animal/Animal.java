package animal;
import moviment.Moviment;

public abstract class Animal {

	Moviment moviment;
	
	public abstract void show();
	
	public void eat(){
	 System.out.println("Estou comendo");	
	}
	
	public void move(Moviment moviment){
		moviment.move();
	}
	
}
