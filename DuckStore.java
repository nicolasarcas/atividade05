package atividade05;

public abstract class DuckStore {
	public final Duck DuckStore(String type) {
		Duck duck = createDucks(type);
		duck.fly();
		duck.quack();
		
		return duck;
	}
	
	public abstract Duck createDucks(String type);
}
