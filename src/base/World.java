package base;

import java.util.ArrayList;

import engine.CollisionControl;
import engine.GridPosition;
import javafx.scene.layout.Pane;

public class World {
	
	private ArrayList<ArrayList<GridSpace>> grid;
	private ArrayList<Entity> entities;
	private Pane pane;
	
	public World(Pane pane) {
		this.grid = new ArrayList<ArrayList<GridSpace>>(Game.NUMGRIDCOL);
		this.entities = new ArrayList<Entity>();
		this.pane = pane;
		
		drawGrid();
		addEntity(new CircleEnt(this.getGridSpace(0, 0).getPosition()));
	}
	
	
	public void update() {
		for (Entity e : entities){
			e.update();
			e.draw();
		}
		
		for (ArrayList<GridSpace> it: grid) {
			for (GridSpace g : it) {
				g.handleCollision();
			}
		}
	}
	
	public void addEntity(Entity e) {
		entities.add(e);
		draw(e);
	}
	
	public void drawGrid() {
		int i = 0;
		for (int k = 0; k < Game.NUMGRIDCOL; k++) {
			grid.add(new ArrayList<GridSpace>(Game.NUMGRIDCOL));
			for (int j = 0; j < Game.NUMGRIDCOL; j++) {
				grid.get(k).add(new GridSpace(new GridPosition(i)));
				this.pane.getChildren().add(grid.get(k).get(j).getDrawable());
				i++;
			}
		}
	}
	
	public void draw(Entity e) {
		this.pane.getChildren().add(e.getDrawable());
	}
	
	public GridSpace getGridSpace(int x, int y) {
		return grid.get(x).get(y); 
	}
}
