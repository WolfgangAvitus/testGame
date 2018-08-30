package testGame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Entity {
	private ImageView imV;
	private Image image;
	private int gridX;
	private int gridY;
	
	public abstract void update();
	
	
	
	public Entity(Image image, int x, int y) {
		this.image = image;
		this.imV = new ImageView(this.image);
		this.imV.setX((int)x);
		this.imV.setX((int)y);
	}
	
	public ImageView getDrawable() {
		return imV;
	}
	
	public void setX(int x) {
		this.imV.setX((int)x);
	}
	
	public int getX() {
		return (int)this.imV.getX();
	}
	
	public void setY(int y) {
		this.imV.setY((int)y);
	}
	
	public int getY() {
		return (int)this.imV.getY();
	}
	
	public void addX(int x) {
		this.imV.setX(this.getX() + x);
	}
	
	public void addY(int y) {
		this.imV.setY(this.getY() + y);
	}
	
	
}
