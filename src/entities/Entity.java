package entities;

import base.Game;
import base.World;
import engine.GridPosition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * abstract entity class
 * @author James
 *
 */
public abstract class Entity {
	private ImageView imV;
	private Image image;
	private GridPosition pos;
	
	public abstract void update(World world);
	public abstract void draw();
	
	
	public Entity(Image image, GridPosition pos) {
		this.image = image;
		this.imV = new ImageView(this.image);
		this.imV.setFitHeight(Game.GRIDLEN);
		this.imV.setFitWidth(Game.GRIDLEN);
		this.imV.setX(pos.getX());
		this.imV.setY(pos.getY());
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
	
	public int moveLeft() {
		this.pos.moveLeft();
		return this.pos.getIdx();
	}
	
	public int moveRight(){
		this.pos.moveRight();
		return this.pos.getIdx();
	}
	
	public int moveDown(){
		this.pos.moveDown();
		return this.pos.getIdx();
	}
	
	public int moveUp(){
		this.pos.moveUp();
		return this.pos.getIdx();
	}
}
