package base;

import java.util.ArrayList;

public class GridSpace {
	
	private double minX;
	private double maxX;
	private double minY;
	private double maxY;
	private int gridID;
	
	private ArrayList<Entity> entities; //stack of entities, if multiple entities handle it
	
	public GridSpace(int id) {
		gridID = id;
		entities = new ArrayList<Entity>();
	}
	
	public Entity getEntity() {
		return entities.get(0);
	}
	
	public boolean isCollision(){
		if (entities.size() > 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getID() {
		return gridID;
	}
}
