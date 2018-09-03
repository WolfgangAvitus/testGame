package base;

import java.util.ArrayList;

import engine.CollisionControl;

public class World {
	
	private double gridLen; //horizontal length, same as vertical
	
	private ArrayList<ArrayList<GridSpace>> grid;
	private ArrayList<Entity> entities;
	
	private CollisionControl collisionManager;
	
	public World() {
		grid = new ArrayList<ArrayList<GridSpace>>();
		
		
		entities = new ArrayList<Entity>();
		this.gridLen = Game.WINDIM/Game.NUMGRID;
	}
	
	public void update() {
	
	}

	public void addEntity() {
		
	}
}
