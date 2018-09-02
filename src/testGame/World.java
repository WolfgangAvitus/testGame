package testGame;

import java.util.ArrayList;

public class World {
	
	private double gridWidth;
	private double gridHeight;
	
	private ArrayList<ArrayList<GridSpace>> grid;
	private ArrayList<Entity> entities;
	
	public World() {
		grid = new ArrayList<ArrayList<GridSpace>>();
		entities = new ArrayList<Entity>();
		this.gridWidth = Game.WINX/Game.NUMGRIDX;
		this.gridHeight = Game.WINY/Game.NUMGRIDY;
	}
	
<<<<<<< HEAD
	
	public void update() {
=======
	public void update(){
>>>>>>> 0e7a85e20a9c24e57f5dfb3520944c1eb0fd7796
		
	}

}
