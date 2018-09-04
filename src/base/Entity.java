package base;

import engine.Collision;
import engine.GridPosition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Entity {
	private ImageView imV;
	private Image image;
	private GridPosition pos;
	
	public abstract void update();
	public abstract void draw();
	
	
	public Entity(Image image, GridPosition pos) {
		this.image = image;
		this.imV = new ImageView(this.image);
		this.imV.setFitHeight(Game.GRIDLEN);
		this.imV.setFitWidth(Game.GRIDLEN);
		this.imV.setX(pos.getX());
		this.imV.setX(pos.getY());
		this.pos= pos;
	}
	
	public ImageView getDrawable() {
		return imV;
	}
	
	public int getIdx(){
		return pos.getIdx();
	}
	
	public void drawFromGridPos() {
		setX(pos.getX());
		setY(pos.getY());
	}
	
	public void setX(double x) {
		this.imV.setX(x);
	}
	
	public double getX() {
		return this.imV.getX();
	}
	
	public void setY(double y) {
		this.imV.setY(y);
	}
	
	public double getY() {
		return this.imV.getY();
	}
	
	public void addX(double x) {
		this.imV.setX(this.getX() + x);
	}
	
	public void addY(double y) {
		this.imV.setY(this.getY() + y);
	}	
	
	public void moveLeft() {
		this.pos.moveLeft();
	}
	
	public void moveRight(){
		this.pos.moveRight();
	}
	
	public void moveDown(){
		this.pos.moveDown();
	}
	
	public void moveUp(){
		this.pos.moveUp();
	}
}
