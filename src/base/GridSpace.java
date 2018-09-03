package base;


public class GridSpace {
	
	private double minX;
	private double maxX;
	private double minY;
	private double maxY;
	private int gridID;
	
	private Entity entity;
	
	public GridSpace(int id) {
		gridID = id;
		entity = null;
	}
	
	public Entity getEntity() {
		return entity;
	}
	
	public boolean hasEntity() {
		if (entity == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public int getID() {
		return gridID;
	}
	
	
}
