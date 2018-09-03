package base;

import java.util.ArrayList;

import engine.CollisionControl;
import javafx.scene.layout.Pane;

public class World {
	
	private double gridLen; //horizontal length, same as vertical
	
	private ArrayList<ArrayList<GridSpace>> grid;
	private ArrayList<Entity> entities;
	private Pane pane;
	
	private CollisionControl collisionManager;
	
	public World(Pane pane) {
		this.grid = new ArrayList<ArrayList<GridSpace>>();
		this.entities = new ArrayList<Entity>();
		this.gridLen = Game.WINDIM/Game.NUMGRIDCOL;
		this.pane = pane;
		
		addEntity(new CircleEnt(getGridX(5), getGridY(10), getGridIdx(5,10))); //change to be clearer? dont need 3
	}
	
	
	public void update() {
		for (Entity e : entities){
			updateGridPosition(e);
			e.update();
		}
	}
	
	
	/**
	 * updates entity e's position on the grid 
	 * This is done in this round about way to check for grid collision. Also stores the entities original position if it needs to go back
	 * @param e
	 */
	public void updateGridPosition(Entity e){
		e.setX(getGridX(e.getIdx()));
		e.setY(getGridY(e.getIdx()));
	}

	public void addEntity(Entity e) {
		entities.add(e);
		draw(e);
	}
	
	public void draw(Entity e) {
		this.pane.getChildren().add(e.getDrawable());
	}
	
	/**
	 * Gets the x location on screen in terms of the grid number
	 * @param idx
	 * @return
	 */
	public double getGridX(int idx){
		if (idx < 0){
			return Game.GRIDLEN/2;
		}
		if (idx > Game.NUMGRIDCOL){
			return Game.WINDIM - Game.GRIDLEN/2;
		}
		return idx%Game.NUMGRIDCOL * Game.GRIDLEN + Game.GRIDLEN/2;
	}
	
	public double getGridY(int idx){
		if (idx < 0){
			return Game.GRIDLEN/2;
		}
		if (idx > Game.NUMGRIDCOL){
			return Game.WINDIM - Game.GRIDLEN/2;
		}
		return (int)Math.floor(idx/Game.NUMGRIDCOL) * Game.GRIDLEN + Game.GRIDLEN/2;
	}
	
	public int getGridIdx(double x, double y){
		//ADD ERROR CHECKING!!!!!!!
		///IMPORTANT
		int xpos = (int)Math.floor(x%Game.GRIDLEN);
		int ypos = (int)Math.floor(y%Game.GRIDLEN);
		
		if (ypos%2 == 0){ //if even
			return ypos*2 + xpos;
		}
		else{//y is odd
			return ypos*2 + xpos + 1;
		}
	}
}
