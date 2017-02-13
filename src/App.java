import animal.*;
import moviment.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal tiger = new Tiger();
		tiger.move(new Walk());
		tiger.show();
		tiger.eat();
		System.out.println("Change moviment");
		tiger.move(new Fly());
		System.out.println("-------------------------");
		
		Animal eagle = new Eagle();
		eagle.move(new Fly());
		eagle.show();
		eagle.eat();
		System.out.println("Change moviment");
		tiger.move(new Walk());
		System.out.println("-------------------------");
	
		Animal shark = new Shark();
		shark.move(new Swim());
		shark.show();
		shark.eat();
		System.out.println("Change moviment");
		tiger.move(new Fly());
		System.out.println("-------------------------");
	
	
	}

}
