package testGame;

import java.util.ArrayList;

public class TestState extends State{
	
	private ArrayList<Entity> entities;
	
	public TestState() {
		System.out.println("****");
		entities.add(new CircleEnt());
		super.draw(entities.get(0));
	}

	
	
	public void drawEntities() {
		for (Entity e: entities) {
			super.draw(e);
		}
	}
	
	@Override
	public void startUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cleanUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
