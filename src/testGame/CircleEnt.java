package testGame;

import java.io.File;

import javafx.scene.image.Image;

public class CircleEnt extends Entity{

	public CircleEnt() { //use resource manager instead
		super(new Image(Game.RESOURCES.getResource("boulder.png")), 100, 100);
		System.out.println("***");
		
	}

}
