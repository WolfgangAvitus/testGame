package base;

import engine.Collision;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Entity {
	private ImageView imV;
	private Image image;
	private int gridIdx;
	
	public abstract void update();
	
	
	public Entity(Image image, double x, double y, int gridIdx) {
		this.image = image;
		this.imV = new ImageView(this.image);
		this.imV.setX(x);
		this.imV.setX(y);
		this.gridIdx = gridIdx;
	}
	
	public ImageView getDrawable() {
		return imV;
	}
	
	public int getIdx(){
		return gridIdx;
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
		this.gridIdx -= 1;
	}
	
	public void moveRight(){
		this.gridIdx += 1;
	}
	
	public void moveDown(){
		this.gridIdx += Game.NUMGRIDCOL;
	}
	
	public void moveUp(){
		this.gridIdx -= Game.NUMGRIDCOL;
	}
}
