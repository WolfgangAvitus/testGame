package testGame;

import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;

public class CircleEnt extends Entity {
	private GameEvent<KeyEvent> playerMovement;
	
	public CircleEnt() { //use resource manager instead
		super(new Image(Game.RESOURCES.getResource("boulder.png")), 300, 100);
		playerMovement = new EventMoveDefault(this);
		Game.SCENE.addEventHandler(KeyEvent.KEY_PRESSED, playerMovement.getHandler());	
	}

	@Override
	public void update() {
		if (super.getX() < 0) {
			super.setX(0);
		}
		if (super.getX() > 600) {
			super.setX(600);
		}
		if (super.getY() < 0) {
			super.setY(0);
		}
		if (super.getY() > 600){
			super.setY(600);
		}
	}

}
