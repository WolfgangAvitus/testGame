package testGame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Entity {
	private ImageView imV;
	private Image image;
	private int x;
	private int y;
	
	
	public Entity(Image image, int x, int y) {
		this.image = image;
		this.imV = new ImageView(this.image);
		this.imV.setX((int)x);
		this.imV.setX((int)y);
	}
	
	public ImageView getDrawable() {
		return imV;
	}
}
