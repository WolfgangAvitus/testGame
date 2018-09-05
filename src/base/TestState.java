package base;

import entities.CircleEnt;
import entities.Enemy1;

public class TestState extends State{
	
	private World world;
	
	public TestState() {
		world = new World(super.getPane());
		world.addEntity(new CircleEnt(world.grid.get(0).getPosition(), world));
		world.addEntity(new Enemy1(world.grid.get(59).getPosition(), world));
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
	}

}
