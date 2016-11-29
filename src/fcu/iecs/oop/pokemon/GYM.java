package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	
	public static void fight(Pokemon p1, Pokemon p2){
		Random rand = new Random();
		if(rand.nextInt(2)==0){//p1 win
			p1.setCp(p1.getCp()+500);
			System.out.println("Winner is " + p1.getName() + ".");
			System.out.println("cp=" + p1.getCp());
		}
		else{//p2 win
			p2.setCp(p2.getCp()+500);
			System.out.println("Winner is " + p2.getName() + ".");
			System.out.println("cp=" + p2.getCp());
		}
	}
}