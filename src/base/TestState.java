package base;

import java.util.ArrayList;

public class TestState extends State{
	
	private World world;
	
	public TestState() {
		world = new World(super.getPane());
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
