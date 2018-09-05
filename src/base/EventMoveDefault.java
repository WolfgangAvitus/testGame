package base;

import entities.Entity;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class EventMoveDefault implements GameEvent<KeyEvent>{
	private EventHandler<KeyEvent> handler;
	
	public EventMoveDefault(Entity entity, World world) {
		this.handler = new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent eve) {
				if (eve.getCode() == KeyCode.UP) {
					world.moveUpGrid(entity);
				}
				if (eve.getCode() == KeyCode.DOWN) {
					//entity.moveDown(); //deprecated?
					world.moveDownGrid(entity);
				}
				if (eve.getCode() == KeyCode.LEFT) {
					world.moveLeftGrid(entity);
				}
				if (eve.getCode() == KeyCode.RIGHT) {
					world.moveRightGrid(entity);
				}
			}
		};
	}
	
	@Override
	public EventHandler<KeyEvent> getHandler() {
		return handler;
	}
}
