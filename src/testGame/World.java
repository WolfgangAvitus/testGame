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
	
	public void update(){
		
	}

}
