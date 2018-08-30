package testGame;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class EventMoveDefault implements GameEvent<KeyEvent>{
	private EventHandler<KeyEvent> handler;
	
	public EventMoveDefault(Entity entity) {
		this.handler = new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent eve) {
				if (eve.getCode() == KeyCode.UP) {
					entity.addY(-5);
				}
				if (eve.getCode() == KeyCode.DOWN) {
					entity.addY(5);
				}
				if (eve.getCode() == KeyCode.LEFT) {
					entity.addX(-5);
				}
				if (eve.getCode() == KeyCode.RIGHT) {
					entity.addX(5);
				}
			}
		};
	}
	
	@Override
	public EventHandler<KeyEvent> getHandler() {
		return handler;
	}
}
