package entities;

import base.EventMoveDefault;
import base.Game;
import base.GameEvent;
import base.World;
import engine.GridPosition;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;

public class CircleEnt extends Entity {
	private GameEvent<KeyEvent> playerMovement;
	
	
	public CircleEnt(GridPosition pos, World world) { //use resource manager instead
		super(new Image(Game.RESOURCES.getResource("boulder.png")), pos);
		playerMovement = new EventMoveDefault(this, world);
		Game.SCENE.addEventHandler(KeyEvent.KEY_PRESSED, playerMovement.getHandler());	
	}

	@Override
	public void update(World world) {
		
	}
	

	@Override
	public void draw() {
		super.drawFromGridPos();
	}

}
