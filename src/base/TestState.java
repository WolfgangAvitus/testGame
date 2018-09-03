package base;

import java.util.ArrayList;

public class TestState extends State{
	
	private ArrayList<Entity> entities; //deprecated, moved into world
	private World world;
	
	public TestState() {
		world = new World();
		entities = new ArrayList<Entity>();
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
		world.update();
		for (Entity e : entities) {
			e.update();
		}
		
		world.update();
	}

}
