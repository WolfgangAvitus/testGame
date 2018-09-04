package base;

import java.util.ArrayList;

import engine.CollisionControl;
import engine.GridPosition;
import javafx.scene.layout.Pane;

public class World {
	
	private ArrayList<GridSpace> grid;
	private ArrayList<Entity> entities; //all entities
	private Pane pane;
	
	public World(Pane pane) {
		this.grid = new ArrayList<GridSpace>();
		this.entities = new ArrayList<Entity>();
		this.pane = pane;
		
		drawGrid();
		addEntity(new CircleEnt(grid.get(0).getPosition(), this));
	}
	
	
	public void update() {
		for (Entity e : entities){
			e.update();
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
	
	public void moveDown(Entity e) {
		GridSpace oldspace = grid.get(e.getIdx());
		
	}
	
	
	public void movetoGrid(Entity e) {
		GridSpace oldspace = grid.get(e.getIdx());
		oldspace.removeEntity(e);
		
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
