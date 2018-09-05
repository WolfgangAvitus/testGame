package base;

import java.util.ArrayList;

import engine.GridPosition;
import engine.GridSpace;
import entities.Entity;
import javafx.scene.layout.Pane;

public class World {
	
	public ArrayList<GridSpace> grid;
	private ArrayList<Entity> entities; //all entities
	private Pane pane;
	
	public World(Pane pane) {
		this.grid = new ArrayList<GridSpace>();
		this.entities = new ArrayList<Entity>();
		this.pane = pane;
		
		drawGrid();
	}
	
	
	public void update() {
		for (Entity e : entities){
			e.update(this);
			e.draw();
		}
		
		for (GridSpace g : grid) {
			g.handleCollision();
		}
		
	}
	
	public void addEntity(Entity e) {
		entities.add(e);
		draw(e);
	}
	
	
	//entity movement
	
	public void moveDownGrid(Entity e) {
		GridSpace oldspace = grid.get(e.getIdx());
		oldspace.removeEntity(e);
		int idx = e.moveDown();
		grid.get(idx).addEntity(e);
	}
	
	public void moveUpGrid(Entity e) {
		GridSpace oldspace = grid.get(e.getIdx());
		oldspace.removeEntity(e);
		int idx = e.moveUp();
		grid.get(idx).addEntity(e);
	}
	
	public void moveRightGrid(Entity e) {
		GridSpace oldspace = grid.get(e.getIdx());
		oldspace.removeEntity(e);
		int idx = e.moveRight();
		grid.get(idx).addEntity(e);
	}
	
	public void moveLeftGrid(Entity e) {
		GridSpace oldspace = grid.get(e.getIdx());
		oldspace.removeEntity(e);
		int idx = e.moveLeft();
		grid.get(idx).addEntity(e);
	}
	
	
	
	
	public void drawGrid() {
		for (int i = 0; i < Game.TOTALGRIDS; i++) {
			grid.add(new GridSpace(new GridPosition(i)));
			this.pane.getChildren().add(grid.get(i).getDrawable());
		}
	}
	
	public void draw(Entity e) {
		this.pane.getChildren().add(e.getDrawable());
	}
}
