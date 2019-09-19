package atividade05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		
		List<Duck> ducks = new ArrayList<>();
		
		Random gerador = new Random();
		
		for(int i =0; i<100;i++) {
			if(gerador.nextBoolean()) {
				ducks.add(new SouthDuck());
			}
			else {
				ducks.add(new NorthDuck());
			}
		}
		
		for (Duck o : ducks) {
			o.fly();
			o.quack();
			System.out.println();
		}

	}

}
