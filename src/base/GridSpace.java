package base;

import java.util.ArrayList;

import engine.GridPosition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GridSpace {
	
	private GridPosition pos;
	private Image image;
	private ImageView imV;
	
	private ArrayList<Entity> entities; //stack of entities, if multiple entities handle it
	
	public GridSpace(GridPosition pos) {
		this.pos = pos;
		entities = new ArrayList<Entity>();
		image = new Image(Game.RESOURCES.getResource("dirt.png"));
		this.imV = new ImageView(this.image);
		this.imV.setFitHeight(Game.GRIDLEN);
		this.imV.setFitWidth(Game.GRIDLEN);
		this.imV.setX(pos.getX());
		this.imV.setY(pos.getY());
	}
	
	public Entity getEntity() {
		return entities.get(0);
	}
	
	public GridPosition getPosition() {
		return pos;
	}
	
	public ImageView getDrawable() {
		return imV;
	}
	
	public boolean isCollision(){
		if (entities.size() > 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void handleCollision() {
		if (isCollision()) {
			
		}
	}
}
